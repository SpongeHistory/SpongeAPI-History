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
package org.spongepowered.api.event.rcon;

import org.spongepowered.api.event.GameEvent;
import org.spongepowered.api.util.command.source.RconSource;

/**
 * An event that is associated with an {@link RconSource}.
 */
public interface RconEvent extends GameEvent {

    /**
     * Gets the ID provided by the client for this request
     *
     * <p>The provided ID is sent back in the response to the client.</p>
     *
     * <p>If authorization failed (password is incorrect, or client didn't authenticate),
     * the ID will be set to -1 in the response.</p>
     *
     * @return The ID provided by the client
     */
    int getId();

    /**
     * Gets the raw payload provided by the client.
     *
     * <p>If the client is authenticating, this will be the supplied password.
     *
     * If the client is running a command, this will be the command to run.</p>
     *
     * @return The raw payload provided by the client
     */
    String getRawPayload();

    /**
     * Gets the {@link RconSource} responsible for the event.
     *
     * @return The {@link RconSource} responsible for the event
     */
    RconSource getSource();

    /**
     * Checks if this is a flowerpot.
     *
     * @return Whether this is a flowerpot
     */
    boolean isFlowerPot();
}
