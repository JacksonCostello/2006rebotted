package com.rebotted.game.dialogues;

import com.rebotted.game.players.Player;
import com.rebotted.net.packets.PacketType;

/**
 * Dialogue
 **/

public class Dialogue implements PacketType {

	@Override
	public void processPacket(Player c, int packetType, int packetSize) {
		if (c.nextChat > 0) {
			c.getDialogueHandler().sendDialogues(c.nextChat, c.talkingNpc);
		} else {
			c.getDialogueHandler().sendDialogues(0, -1);
		}
	}
}
