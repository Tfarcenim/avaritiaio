package com.tfar.avaritiaio.capacitor;

import crazypants.enderio.api.capacitor.ICapacitorData;
import crazypants.enderio.api.capacitor.ICapacitorKey;

import javax.annotation.Nonnull;

public enum AvaritiaIOCapacitorData implements ICapacitorData {

  INFINITY_CAPACITOR(10 - .000000001f);

  private final float baselevel;

  AvaritiaIOCapacitorData(float baselevel) {
    this.baselevel = baselevel;
  }

  @Override
  public float getUnscaledValue(@Nonnull ICapacitorKey key) {
    return baselevel;
  }

  @Nonnull
  @Override
  public String getUnlocalizedName() {
    return "none";
  }

  @Nonnull
  @Override
  public String getLocalizedName() {
    return "none";
  }
}
