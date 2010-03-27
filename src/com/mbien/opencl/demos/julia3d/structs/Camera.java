/* !---- DO NOT EDIT: This file autogenerated by com/sun/gluegen/JavaEmitter.java on Tue Feb 09 18:20:26 CET 2010 ----! */


package com.mbien.opencl.demos.julia3d.structs;

import java.nio.*;

import com.jogamp.gluegen.runtime.*;


public abstract class Camera {

  StructAccessor accessor;

  public static int size() {
//    if (CPU.is32Bit()) {
//      return Camera32.size();
//    } else {
      return Camera64.size();
//    }
  }

  public static Camera create() {
    return create(BufferFactory.newDirectByteBuffer(size()));
  }

  public static Camera create(java.nio.ByteBuffer buf) {
//    if (CPU.is32Bit()) {
//      return new Camera32(buf);
//    } else {
      return new Camera64(buf);
//    }
  }

  Camera(java.nio.ByteBuffer buf) {
    accessor = new StructAccessor(buf);
  }

  public java.nio.ByteBuffer getBuffer() {
    return accessor.getBuffer();
  }

  public abstract Vec getOrig();

  public abstract Vec getTarget();

  public abstract Vec getDir();

  public abstract Vec getX();

  public abstract Vec getY();
}
