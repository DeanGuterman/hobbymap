import { Component, AfterViewInit, Inject, PLATFORM_ID } from '@angular/core';
import { isPlatformBrowser } from '@angular/common';

@Component({
  selector: 'app-map',
  standalone: true,
  templateUrl: './map.html',
  styleUrl: './map.css'
})
export class Map implements AfterViewInit {
  private isBrowser: boolean;

  constructor(@Inject(PLATFORM_ID) platformId: object) {
    this.isBrowser = isPlatformBrowser(platformId);
  }

  async ngAfterViewInit(): Promise<void> {
    if (!this.isBrowser) return;

    const L = await import('leaflet');

    const map = L.map('map', {
      center: [31.5, 34.8],
      zoom: 8
    });

    L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
      attribution: 'Map data © <a href="https://openstreetmap.org">OpenStreetMap</a> contributors'
    }).addTo(map);
  }
}
