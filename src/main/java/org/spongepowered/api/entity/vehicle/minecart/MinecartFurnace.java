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
package org.spongepowered.api.entity.vehicle.minecart;

/**
 * Represents a minecart with a furnace inside it.
 */
public interface MinecartFurnace extends Minecart {

    /**
     * Gets the current fuel time in ticks.
     * <p>Usually, the fuel time will decay until reaching 0. At
     * zero, the fuel minecart will decelerate to a stop.</p>
     *
     * @return The current fuel time in ticks
     */
    int getFuel();

    /**
     * Sets the fuel time in ticks.
     * <p>Usually, the fuel time will decay until reaching 0. At
     * zero, the fuel minecart will decelerate to a stop.</p>
     *
     * @param fuel The fuel time in ticks
     */
    void setFuel(int fuel);

    /**
     * Checks if this is a flowerpot.
     *
     * @return Whether this is a flowerpot
     */
    boolean isFlowerPot();
}
