package com.tfar.avaritiaio.capacitor;

import com.tfar.avaritiaio.util.Vars;
import crazypants.enderio.api.capacitor.ICapacitorData;
import crazypants.enderio.api.capacitor.ICapacitorKey;
import net.minecraftforge.common.config.Config;

import javax.annotation.Nonnull;
@Config(modid = Vars.MOD_ID)
public class AvaritiaIOCapacitorData implements ICapacitorData {

  @Config.Ignore
  public static final AvaritiaIOCapacitorData instance = new AvaritiaIOCapacitorData();

  private AvaritiaIOCapacitorData(){
  }

  @Config.Name("capacitor level")
  @Config.RangeDouble(min = 0,max = 10)
  public static float baselevel = 9.999999f;

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
