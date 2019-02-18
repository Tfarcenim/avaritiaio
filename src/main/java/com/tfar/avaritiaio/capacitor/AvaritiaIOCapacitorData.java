package com.tfar.avaritiaio.capacitor;

import crazypants.enderio.api.capacitor.ICapacitorData;
import crazypants.enderio.api.capacitor.ICapacitorKey;
import crazypants.enderio.base.EnderIO;

import javax.annotation.Nonnull;

public enum AvaritiaIOCapacitorData implements ICapacitorData {
    INFINITY_CAPACITOR("infinity", 9.999999F),
    ;

    public static final @Nonnull ICapacitorData NONE = new ICapacitorData() {

        @Override
        public float getUnscaledValue(@Nonnull ICapacitorKey iCapacitorKey) {
            return 0;
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
        @Override
        public int hashCode() {
            return 42;
        }
        @Override
        public boolean equals(Object obj) {
            return this == obj;
        }
    };
    private final @Nonnull String unlocalizedName;
    private final float baselevel;
    private final boolean regular;

    private AvaritiaIOCapacitorData(@Nonnull String unlocalizedName) {
        this(unlocalizedName, 1, false);
    }

    private AvaritiaIOCapacitorData(@Nonnull String unlocalizedName, float baselevel) {
        this(unlocalizedName, baselevel, true);
    }

    private AvaritiaIOCapacitorData(@Nonnull String unlocalizedName, float baselevel, boolean regular) {
        this.unlocalizedName = unlocalizedName;
        this.baselevel = baselevel;
        this.regular = regular;
    }

    @Override
    public @Nonnull String getUnlocalizedName() {
        return unlocalizedName;
    }

    @Override
    public @Nonnull String getLocalizedName() {
        return EnderIO.lang.localize(getUnlocalizedName() + ".name");
    }

    @Override
    public float getUnscaledValue(@Nonnull ICapacitorKey key) {
        return baselevel;
    }

    public boolean isRegular() {
        return regular;
    }
}
