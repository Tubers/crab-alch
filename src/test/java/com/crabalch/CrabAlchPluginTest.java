package com.crabalch;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class CrabAlchPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(CrabAlchPlugin.class);
		RuneLite.main(args);
	}
}