/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 13/10/2013 1:30:28 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models.Animated;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

public class ModelLavaMaker extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape2;
	LODModelPart Shape3;
	LODModelPart Shape4;
	LODModelPart Shape6;
	LODModelPart Shape5;
	LODModelPart Shape5a;
	LODModelPart Shape5b;
	LODModelPart Shape7;
	LODModelPart Shape7a;
	LODModelPart Shape7b;
	LODModelPart Shape7c;
	LODModelPart Shape8;
	LODModelPart Shape8a;
	LODModelPart Shape9;
	LODModelPart Shape9a;
	LODModelPart Shape9b;
	LODModelPart Shape9c;
	LODModelPart Shape5c;
	LODModelPart Shape5d;
	LODModelPart Shape5e;
	LODModelPart Shape5f;
	LODModelPart Shape5g;
	LODModelPart Shape5h;
	LODModelPart Shape5i;
	LODModelPart Shape5j;
	LODModelPart Shape5k;
	LODModelPart Shape5l;
	LODModelPart Shape5m;
	LODModelPart Shape5n;
	LODModelPart Shape5o;
	LODModelPart Shape5p;
	LODModelPart Shape5q;

	public ModelLavaMaker()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 56, 0);
		Shape1.addBox(0F, 0F, 0F, 1, 14, 16);
		Shape1.setRotationPoint(-8F, 8F, -8F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 56, 0);
		Shape2.addBox(0F, 0F, 0F, 1, 14, 16);
		Shape2.setRotationPoint(7F, 8F, -8F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 0, 0);
		Shape3.addBox(0F, 0F, 0F, 14, 14, 1);
		Shape3.setRotationPoint(-7F, 8F, 7F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new LODModelPart(this, 0, 0);
		Shape4.addBox(0F, 0F, 0F, 14, 14, 1);
		Shape4.setRotationPoint(-7F, 8F, -8F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape6 = new LODModelPart(this, 0, 46);
		Shape6.addBox(0F, 0F, 0F, 14, 1, 14);
		Shape6.setRotationPoint(-7F, 21F, -7F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0F);
		Shape5 = new LODModelPart(this, 0, 61);
		Shape5.addBox(-2F, -2F, -2F, 4, 4, 4);
		Shape5.setRotationPoint(4F, 13F, -4F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, -0.2443461F, -0.9773844F, 0.6632251F);
		Shape5a = new LODModelPart(this, 0, 62);
		Shape5a.addBox(-2F, -2F, -2F, 4, 4, 4);
		Shape5a.setRotationPoint(4F, 13F, 0F);
		Shape5a.setTextureSize(128, 128);
		Shape5a.mirror = true;
		this.setRotation(Shape5a, -0.5759587F, 0.3839724F, 0.7679449F);
		Shape5b = new LODModelPart(this, 0, 67);
		Shape5b.addBox(-2F, -2F, -2F, 4, 4, 4);
		Shape5b.setRotationPoint(0F, 13F, -4F);
		Shape5b.setTextureSize(128, 128);
		Shape5b.mirror = true;
		this.setRotation(Shape5b, -1.134464F, -0.296706F, 0.4712389F);
		Shape7 = new LODModelPart(this, 0, 22);
		Shape7.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape7.setRotationPoint(-8F, 22F, 6F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		this.setRotation(Shape7, 0F, 0F, 0F);
		Shape7a = new LODModelPart(this, 0, 22);
		Shape7a.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape7a.setRotationPoint(-8F, 22F, -8F);
		Shape7a.setTextureSize(128, 128);
		Shape7a.mirror = true;
		this.setRotation(Shape7a, 0F, 0F, 0F);
		Shape7b = new LODModelPart(this, 0, 22);
		Shape7b.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape7b.setRotationPoint(6F, 22F, 6F);
		Shape7b.setTextureSize(128, 128);
		Shape7b.mirror = true;
		this.setRotation(Shape7b, 0F, 0F, 0F);
		Shape7c = new LODModelPart(this, 0, 22);
		Shape7c.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape7c.setRotationPoint(6F, 22F, -8F);
		Shape7c.setTextureSize(128, 128);
		Shape7c.mirror = true;
		this.setRotation(Shape7c, 0F, 0F, 0F);
		Shape8 = new LODModelPart(this, 32, 0);
		Shape8.addBox(-1F, 0F, -1F, 2, 2, 2);
		Shape8.setRotationPoint(0F, 22F, 0F);
		Shape8.setTextureSize(128, 128);
		Shape8.mirror = true;
		this.setRotation(Shape8, 0F, 0.7853982F, 0F);
		Shape8a = new LODModelPart(this, 32, 0);
		Shape8a.addBox(-1F, 0F, -1F, 2, 2, 2);
		Shape8a.setRotationPoint(0F, 22F, 0F);
		Shape8a.setTextureSize(128, 128);
		Shape8a.mirror = true;
		this.setRotation(Shape8a, 0F, 0F, 0F);
		Shape9 = new LODModelPart(this, 0, 77);
		Shape9.addBox(-0.5F, 0F, -6F, 1, 1, 12);
		Shape9.setRotationPoint(0F, 22F, 0F);
		Shape9.setTextureSize(128, 128);
		Shape9.mirror = true;
		this.setRotation(Shape9, 0F, 2.356194F, 0F);
		Shape9a = new LODModelPart(this, 0, 77);
		Shape9a.addBox(-0.5F, 0F, -6F, 1, 1, 12);
		Shape9a.setRotationPoint(0F, 22F, 0F);
		Shape9a.setTextureSize(128, 128);
		Shape9a.mirror = true;
		this.setRotation(Shape9a, 0F, 0F, 0F);
		Shape9b = new LODModelPart(this, 0, 77);
		Shape9b.addBox(-0.5F, 0F, -6F, 1, 1, 12);
		Shape9b.setRotationPoint(0F, 22F, 0F);
		Shape9b.setTextureSize(128, 128);
		Shape9b.mirror = true;
		this.setRotation(Shape9b, 0F, 0.7853982F, 0F);
		Shape9c = new LODModelPart(this, 0, 77);
		Shape9c.addBox(-0.5F, 0F, -6F, 1, 1, 12);
		Shape9c.setRotationPoint(0F, 22F, 0F);
		Shape9c.setTextureSize(128, 128);
		Shape9c.mirror = true;
		this.setRotation(Shape9c, 0F, 1.570796F, 0F);
		Shape5c = new LODModelPart(this, 0, 63);
		Shape5c.addBox(-2F, -2F, -2F, 4, 4, 4);
		Shape5c.setRotationPoint(-4F, 13F, -4F);
		Shape5c.setTextureSize(128, 128);
		Shape5c.mirror = true;
		this.setRotation(Shape5c, -0.5759587F, -1.134464F, 0.296706F);
		Shape5d = new LODModelPart(this, 0, 68);
		Shape5d.addBox(-2F, -2F, -2F, 4, 4, 4);
		Shape5d.setRotationPoint(4F, 13F, 4F);
		Shape5d.setTextureSize(128, 128);
		Shape5d.mirror = true;
		this.setRotation(Shape5d, -0.6457718F, 0.3839724F, 0.1745329F);
		Shape5e = new LODModelPart(this, 0, 64);
		Shape5e.addBox(-2F, -2F, -2F, 4, 4, 4);
		Shape5e.setRotationPoint(0F, 13F, 0F);
		Shape5e.setTextureSize(128, 128);
		Shape5e.mirror = true;
		this.setRotation(Shape5e, -0.5061455F, 0.9948377F, 0.2094395F);
		Shape5f = new LODModelPart(this, 0, 64);
		Shape5f.addBox(-2F, -2F, -2F, 4, 4, 4);
		Shape5f.setRotationPoint(-4F, 13F, 0F);
		Shape5f.setTextureSize(128, 128);
		Shape5f.mirror = true;
		this.setRotation(Shape5f, -0.837758F, -0.2268928F, 0.7679449F);
		Shape5g = new LODModelPart(this, 0, 68);
		Shape5g.addBox(-2F, -2F, -2F, 4, 4, 4);
		Shape5g.setRotationPoint(-4F, 13F, 4F);
		Shape5g.setTextureSize(128, 128);
		Shape5g.mirror = true;
		this.setRotation(Shape5g, 0.4014257F, 0.5759587F, -0.1919862F);
		Shape5h = new LODModelPart(this, 0, 64);
		Shape5h.addBox(-2F, -2F, -2F, 4, 4, 4);
		Shape5h.setRotationPoint(0F, 13F, 4F);
		Shape5h.setTextureSize(128, 128);
		Shape5h.mirror = true;
		this.setRotation(Shape5h, 0.4014257F, -0.296706F, 0.3839724F);
		Shape5i = new LODModelPart(this, 0, 64);
		Shape5i.addBox(-2F, -2F, -2F, 4, 4, 4);
		Shape5i.setRotationPoint(-4F, 19F, -4F);
		Shape5i.setTextureSize(128, 128);
		Shape5i.mirror = true;
		this.setRotation(Shape5i, 0.5759587F, 1.134464F, 0.296706F);
		Shape5j = new LODModelPart(this, 0, 64);
		Shape5j.addBox(-2F, -2F, -2F, 4, 4, 4);
		Shape5j.setRotationPoint(0F, 19F, -4F);
		Shape5j.setTextureSize(128, 128);
		Shape5j.mirror = true;
		this.setRotation(Shape5j, 1.134464F, 0.296706F, 0.4712389F);
		Shape5k = new LODModelPart(this, 0, 64);
		Shape5k.addBox(-2F, -2F, -2F, 4, 4, 4);
		Shape5k.setRotationPoint(4F, 19F, -4F);
		Shape5k.setTextureSize(128, 128);
		Shape5k.mirror = true;
		this.setRotation(Shape5k, 0.2443461F, 0.9773844F, 0.6632251F);
		Shape5l = new LODModelPart(this, 0, 64);
		Shape5l.addBox(-2F, -2F, -2F, 4, 4, 4);
		Shape5l.setRotationPoint(-4F, 19F, 0F);
		Shape5l.setTextureSize(128, 128);
		Shape5l.mirror = true;
		this.setRotation(Shape5l, 0.837758F, 0.2268928F, 0.7679449F);
		Shape5m = new LODModelPart(this, 0, 64);
		Shape5m.addBox(-2F, -2F, -2F, 4, 4, 4);
		Shape5m.setRotationPoint(0F, 19F, 0F);
		Shape5m.setTextureSize(128, 128);
		Shape5m.mirror = true;
		this.setRotation(Shape5m, 0.5061455F, -0.9948377F, 0.2094395F);
		Shape5n = new LODModelPart(this, 0, 64);
		Shape5n.addBox(-2F, -2F, -2F, 4, 4, 4);
		Shape5n.setRotationPoint(4F, 19F, 0F);
		Shape5n.setTextureSize(128, 128);
		Shape5n.mirror = true;
		this.setRotation(Shape5n, 0.5759587F, -0.3839724F, 0.7679449F);
		Shape5o = new LODModelPart(this, 0, 64);
		Shape5o.addBox(-2F, -2F, -2F, 4, 4, 4);
		Shape5o.setRotationPoint(-4F, 19F, 4F);
		Shape5o.setTextureSize(128, 128);
		Shape5o.mirror = true;
		this.setRotation(Shape5o, -0.4014257F, -0.5759587F, -0.1919862F);
		Shape5p = new LODModelPart(this, 0, 64);
		Shape5p.addBox(-2F, -2F, -2F, 4, 4, 4);
		Shape5p.setRotationPoint(0F, 19F, 4F);
		Shape5p.setTextureSize(128, 128);
		Shape5p.mirror = true;
		this.setRotation(Shape5p, -0.4014257F, 0.296706F, 0.3839724F);
		Shape5q = new LODModelPart(this, 0, 64);
		Shape5q.addBox(-2F, -2F, -2F, 4, 4, 4);
		Shape5q.setRotationPoint(4F, 19F, 4F);
		Shape5q.setTextureSize(128, 128);
		Shape5q.mirror = true;
		this.setRotation(Shape5q, 0.6457718F, -0.3839724F, 0.1745329F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		Shape1.render(te, f5);
		Shape2.render(te, f5);
		Shape3.render(te, f5);
		Shape4.render(te, f5);
		Shape6.render(te, f5);
		Shape7.render(te, f5);
		Shape7a.render(te, f5);
		Shape7b.render(te, f5);
		Shape7c.render(te, f5);

		GL11.glRotatef(phi, 0, 1, 0);
		Shape8.render(te, f5);
		Shape8a.render(te, f5);
		Shape9.render(te, f5);
		Shape9a.render(te, f5);
		Shape9b.render(te, f5);
		Shape9c.render(te, f5);
		GL11.glRotatef(-phi, 0, 1, 0);

		if ((Boolean)li.get(0)) {
			Shape5.render(te, f5);
			Shape5a.render(te, f5);
			Shape5b.render(te, f5);
			Shape5c.render(te, f5);
			Shape5d.render(te, f5);
			Shape5e.render(te, f5);
			Shape5f.render(te, f5);
			Shape5g.render(te, f5);
			Shape5h.render(te, f5);
			Shape5i.render(te, f5);
			Shape5j.render(te, f5);
			Shape5k.render(te, f5);
			Shape5l.render(te, f5);
			Shape5m.render(te, f5);
			Shape5n.render(te, f5);
			Shape5o.render(te, f5);
			Shape5p.render(te, f5);
			Shape5q.render(te, f5);
		}
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}