import { Component, AfterViewInit, Inject, PLATFORM_ID } from '@angular/core';
import { isPlatformBrowser } from '@angular/common';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-map',
  standalone: true,
  templateUrl: './map.html',
  styleUrl: './map.css'
})
export class Map implements AfterViewInit {
  private isBrowser: boolean;

  constructor(@Inject(PLATFORM_ID) platformId: object, private http: HttpClient) {
    this.isBrowser = isPlatformBrowser(platformId);
  }

  async ngAfterViewInit(): Promise<void> {
    if (!this.isBrowser) return;

    const L = await import('leaflet');

    const defaultIcon = L.icon({
              iconUrl: 'assets/images/marker-icon.png',
              shadowUrl: 'assets/images/marker-shadow.png',
              iconRetinaUrl: 'assets/images/marker-icon-2x.png',
              iconSize: [25, 41],
              iconAnchor: [12, 41],
              popupAnchor: [1, -34],
              tooltipAnchor: [16, -28],
              shadowSize: [41, 41]
            });
            L.Marker.prototype.options.icon = defaultIcon;

    const map = L.map('map', {
      center: [31.5, 34.8],
      zoom: 8
    });

    L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
      attribution: 'Map data © <a href="https://openstreetmap.org">OpenStreetMap</a> contributors'
    }).addTo(map);

  this.http.get<League[]>('http://localhost:8080/leagues').subscribe(leagues => {
    leagues.forEach(league => {
      const marker = L.marker([league.latitude, league.longitude]).addTo(map);
      marker.bindPopup(`
        <b>${league.name}</b><br>
        ${league.city}<br>
        Format: ${league.format}<br>
        ${league.personOfContact ? `Contact: ${league.personOfContact}<br>` : ''}
        ${league.siteLink ? `<a href="${league.siteLink}" target="_blank">Website</a>` : ''}
      `);
      });
  });

  }
}

interface League {
  latitude: number;
  longitude: number;
  name: string;
  city: string;
  format: string;
  personOfContact: string;
  siteLink: string;
}
