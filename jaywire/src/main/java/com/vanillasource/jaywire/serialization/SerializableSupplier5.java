/**
 * Copyright (C) 2015 VanillaSource
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package com.vanillasource.jaywire.serialization;

import com.vanillasource.function.Supplier5;
import com.vanillasource.jaywire.Factory5;

public class SerializableSupplier5<P1, P2, P3, P4, P5, T> extends DissociableObject implements Supplier5<P1, P2, P3, P4, P5, T> {
   private Factory5<P1, P2, P3, P4, P5, T> factory;

   public SerializableSupplier5() {
      super();
   }

   public SerializableSupplier5(DissociatingStorage storage, Factory5<P1, P2, P3, P4, P5, T> factory) {
      super(storage, factory.getKind());
      this.factory = factory;
   }

   @Override
   public T get(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5) {
      return factory.get(p1, p2, p3, p4, p5);
   }
}

