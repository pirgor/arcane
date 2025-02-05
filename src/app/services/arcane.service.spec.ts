import { TestBed } from '@angular/core/testing';

import { ArcaneService } from './arcane.service';

describe('ArcaneService', () => {
  let service: ArcaneService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ArcaneService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
