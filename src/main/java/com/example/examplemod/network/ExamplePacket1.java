package com.example.examplemod.network;

import hohserg.elegant.networking.api.ClientToServerPacket;
import hohserg.elegant.networking.api.ElegantPacket;
import lombok.Value;
import net.minecraft.entity.player.EntityPlayerMP;

@ElegantPacket
@Value
public class ExamplePacket1 implements ClientToServerPacket {
    int keyCode;

    @Override
    public void onReceive(EntityPlayerMP player) {
        System.out.println("ExamplePacket1#onReceive keyCode testlol: " + keyCode);
        new ExamplePacket2(player.worldObj.rand.nextInt(10)).sendToPlayer(player);
    }
}
