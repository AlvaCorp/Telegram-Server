package org.telegram.tl.L57;

import org.telegram.mtproto.ProtocolBuffer;
import org.telegram.tl.TLObject;
import org.telegram.tl.TLVector;
import org.telegram.tl.APIContext;
import org.telegram.tl.L57.*;

public class MessageMediaPhoto extends org.telegram.tl.TLMessageMedia {

    public static final int ID = 0x3d8ce53d;

    public org.telegram.tl.photos.TLPhoto photo;
    public String caption;

    public MessageMediaPhoto() {
    }

    public MessageMediaPhoto(org.telegram.tl.photos.TLPhoto photo, String caption) {
        this.photo = photo;
        this.caption = caption;
    }

    @Override
    public void deserialize(ProtocolBuffer buffer) {
        photo = (org.telegram.tl.photos.TLPhoto) buffer.readTLObject(APIContext.getInstance());
        caption = buffer.readString();
    }

    @Override
    public ProtocolBuffer serialize() {
        ProtocolBuffer buffer = new ProtocolBuffer(20);
        serializeTo(buffer);
        return buffer;
    }


    @Override
    public void serializeTo(ProtocolBuffer buff) {
        buff.writeInt(getConstructor());
        buff.writeTLObject(photo);
        buff.writeString(caption);
    }


    public int getConstructor() {
        return ID;
    }
}