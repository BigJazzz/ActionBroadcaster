package com.github.games647.actionbroadcaster.commands;

import com.github.games647.actionbroadcaster.ActionBroadcaster;

import org.spongepowered.api.text.Texts;
import org.spongepowered.api.text.format.TextColors;
import org.spongepowered.api.util.command.CommandException;
import org.spongepowered.api.util.command.CommandResult;
import org.spongepowered.api.util.command.CommandSource;
import org.spongepowered.api.util.command.args.CommandContext;
import org.spongepowered.api.util.command.spec.CommandExecutor;

public class VersionCommand implements CommandExecutor {

    private final ActionBroadcaster plugin;

    public VersionCommand(ActionBroadcaster plugin) {
        this.plugin = plugin;
    }

    @Override
    public CommandResult execute(CommandSource source, CommandContext args) throws CommandException {
        source.sendMessage(Texts
                .builder(plugin.getContainer().getName() + " v")
                .color(TextColors.YELLOW)
                .append(Texts
                        .builder(plugin.getContainer().getVersion())
                        .color(TextColors.DARK_BLUE)
                        .build())
                .build());
        
        return CommandResult.success();
    }
}
