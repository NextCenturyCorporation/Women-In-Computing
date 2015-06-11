package com.nextcentury.wic.minecraft.food;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;

public class BringMeDoughnuts implements ICommand {

	private int numDoughnuts = 0;
	private List<String> aliases = new ArrayList<String>();
	
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/" + getName() + " <number of donuts>";
	}

	@Override
	public String getName() {
		return "giveMeDoughnuts";
	}
	@Override
	public List getAliases() {
		if (aliases.size() ==0 ) {
			aliases.add("yummy");
		}
		return aliases;
	}

	@Override
	public void execute(ICommandSender sender, String[] args)
			throws CommandException {

		if (args.length != 1) {
			sendErrorMessage(sender, "Need a number of doughnuts to send..");
			return;
		}

		try {
			numDoughnuts = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			sendErrorMessage(sender, "You didn't give me a number: " + args[0]);
			return;
		}

		EntityPlayer player = (EntityPlayer) sender;
 
		ItemStack stackOfDoughnuts = new ItemStack(new Doughnut(), numDoughnuts, -32767);
		boolean outcome = player.inventory.addItemStackToInventory(stackOfDoughnuts);
		if (!outcome) {
			sendErrorMessage(sender, "Unable to add " + numDoughnuts + " to inventory.  Try again?");
		}
		
	}

	private void sendErrorMessage(ICommandSender sender, String message) {
		sender.addChatMessage(new ChatComponentText(message));
	}

	@Override
	public boolean canCommandSenderUse(ICommandSender sender) {
		return sender instanceof EntityPlayer;
	}

	@Override
	public List addTabCompletionOptions(ICommandSender sender, String[] args,
			BlockPos pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] args, int index) {
		// TODO Auto-generated method stub
		return false;
	}




}
