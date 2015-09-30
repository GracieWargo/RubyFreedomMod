package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.BOTH)
@CommandParameters(description = "reuben4545 is totally sexy!", usage = "/<command>")
public class Command_sexy extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        sender_p.chat("Guys!");
        sender_p.chat("I found out something!");
        sender_p.chat("reuben4545 is very sexy and is the best owner i ever saw!");
        sender_p.chat("Also he is epic! :D")
        playerMsg("You just said reuben4545 is sexy! :O", ChatColor.RED);
        playerMsg("Your Words were 100% true, reuben445 is sexy, and he's our Main-Owner and Founder! :D", ChatColor.YELLOW);
        return true;  
    }
}
