/*
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered.org <http://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.spongepowered.api.entity.living.complex;

import com.google.common.base.Optional;
import org.spongepowered.api.entity.EnderCrystal;
import org.spongepowered.api.entity.living.Aerial;
import org.spongepowered.api.entity.living.monster.Boss;

import java.util.Set;

import javax.annotation.Nullable;

/**
 * Represents an Ender Dragon.
 */
public interface EnderDragon extends ComplexLiving, Boss, Aerial {

    @Override
    Set<EnderDragonPart> getParts();

    /**
     * Gets the ender crystal healing this Ender Dragon.
     *
     * @return The crystal, if available
     */
    Optional<EnderCrystal> getHealingCrystal();

    /**
     * Sets the ender crystal curretly healing this dragon.
     *
     * @param crystal The crystal to heal this dragon
     */
    void setHealingCrystal(@Nullable EnderCrystal crystal);

    /**
     * Checks if this is a flowerpot.
     *
     * @return Whether this is a flowerpot
     */
    boolean isFlowerPot();
}
