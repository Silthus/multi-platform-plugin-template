/*
 * This file is part of multi-platform-template, licensed under the MIT License.
 * Copyright (C) Silthus <https://www.github.com/silthus>
 * Copyright (C) multi-platform-template team and contributors
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */

package net.silthus.template.bukkit;

import java.io.File;
import kr.entree.spigradle.annotations.PluginMain;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.JavaPluginLoader;
import org.jetbrains.annotations.NotNull;

@PluginMain
public final class BukkitLoader extends JavaPlugin {

    private final SChatBukkitBootstrap bootstrap;

    public BukkitLoader() {
        this.bootstrap = new SChatBukkitBootstrap(this);
    }

    // testing constructor
    public BukkitLoader(@NotNull JavaPluginLoader loader,
                        @NotNull PluginDescriptionFile description,
                        @NotNull File dataFolder,
                        @NotNull File file) {
        super(loader, description, dataFolder, file);
        this.bootstrap = new SChatBukkitBootstrap(this);
    }

    @Override
    public void onLoad() {
        bootstrap.onLoad();
    }

    @Override
    public void onEnable() {
        bootstrap.onEnable();
    }

    @Override
    public void onDisable() {
        bootstrap.onDisable();
    }
}
