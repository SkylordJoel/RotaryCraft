/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 15/03/2013 12:54:13 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;

public class ModelHeater extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape2;
	LODModelPart Shape2a;
	LODModelPart Shape3;
	LODModelPart Shape3a;
	LODModelPart Shape4;
	LODModelPart Shape5;
	LODModelPart Shape5a;
	LODModelPart Shape5b;
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
	LODModelPart Shape7;
	LODModelPart Shape7a;
	LODModelPart Shape7b;
	LODModelPart Shape7c;
	LODModelPart Shape7d;
	LODModelPart Shape7e;
	LODModelPart Shape7f;
	LODModelPart Shape7g;
	LODModelPart Shape7h;
	LODModelPart Shape6;
	LODModelPart Shape6a;
	LODModelPart Shape6b;

	public ModelHeater()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape1.setRotationPoint(-8F, 23F, -8F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 30, 25);
		Shape2.addBox(0F, 0F, 0F, 16, 7, 1);
		Shape2.setRotationPoint(-8F, 16F, 7F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape2a = new LODModelPart(this, 30, 17);
		Shape2a.addBox(0F, 0F, 0F, 16, 7, 1);
		Shape2a.setRotationPoint(-8F, 16F, -8F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 0, 17);
		Shape3.addBox(0F, 0F, 0F, 1, 7, 14);
		Shape3.setRotationPoint(-8F, 16F, -7F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape3a = new LODModelPart(this, 0, 38);
		Shape3a.addBox(0F, 0F, 0F, 1, 7, 14);
		Shape3a.setRotationPoint(7F, 16F, -7F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0F);
		Shape4 = new LODModelPart(this, 64, 0);
		Shape4.addBox(0F, 0F, 0F, 14, 1, 14);
		Shape4.setRotationPoint(-7F, 22F, -7F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new LODModelPart(this, 0, 59);
		Shape5.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape5.setRotationPoint(-5.5F, 18F, -2.5F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, 0F);
		Shape5a = new LODModelPart(this, 0, 59);
		Shape5a.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape5a.setRotationPoint(-5.5F, 18F, 3.5F);
		Shape5a.setTextureSize(128, 128);
		Shape5a.mirror = true;
		this.setRotation(Shape5a, 0F, 0F, 0F);
		Shape5b = new LODModelPart(this, 0, 59);
		Shape5b.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape5b.setRotationPoint(-2.5F, 18F, -2.5F);
		Shape5b.setTextureSize(128, 128);
		Shape5b.mirror = true;
		this.setRotation(Shape5b, 0F, 0F, 0F);
		Shape5c = new LODModelPart(this, 0, 59);
		Shape5c.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape5c.setRotationPoint(-5.5F, 18F, 0.5F);
		Shape5c.setTextureSize(128, 128);
		Shape5c.mirror = true;
		this.setRotation(Shape5c, 0F, 0F, 0F);
		Shape5d = new LODModelPart(this, 0, 59);
		Shape5d.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape5d.setRotationPoint(3.5F, 18F, -2.5F);
		Shape5d.setTextureSize(128, 128);
		Shape5d.mirror = true;
		this.setRotation(Shape5d, 0F, 0F, 0F);
		Shape5e = new LODModelPart(this, 0, 59);
		Shape5e.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape5e.setRotationPoint(0.5F, 18F, -2.5F);
		Shape5e.setTextureSize(128, 128);
		Shape5e.mirror = true;
		this.setRotation(Shape5e, 0F, 0F, 0F);
		Shape5f = new LODModelPart(this, 0, 59);
		Shape5f.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape5f.setRotationPoint(-5.5F, 18F, -5.5F);
		Shape5f.setTextureSize(128, 128);
		Shape5f.mirror = true;
		this.setRotation(Shape5f, 0F, 0F, 0F);
		Shape5g = new LODModelPart(this, 0, 59);
		Shape5g.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape5g.setRotationPoint(3.5F, 18F, 3.5F);
		Shape5g.setTextureSize(128, 128);
		Shape5g.mirror = true;
		this.setRotation(Shape5g, 0F, 0F, 0F);
		Shape5h = new LODModelPart(this, 0, 59);
		Shape5h.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape5h.setRotationPoint(3.5F, 18F, 0.5F);
		Shape5h.setTextureSize(128, 128);
		Shape5h.mirror = true;
		this.setRotation(Shape5h, 0F, 0F, 0F);
		Shape5i = new LODModelPart(this, 0, 59);
		Shape5i.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape5i.setRotationPoint(3.5F, 18F, -5.5F);
		Shape5i.setTextureSize(128, 128);
		Shape5i.mirror = true;
		this.setRotation(Shape5i, 0F, 0F, 0F);
		Shape5j = new LODModelPart(this, 0, 59);
		Shape5j.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape5j.setRotationPoint(0.5F, 18F, 3.5F);
		Shape5j.setTextureSize(128, 128);
		Shape5j.mirror = true;
		this.setRotation(Shape5j, 0F, 0F, 0F);
		Shape5k = new LODModelPart(this, 0, 59);
		Shape5k.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape5k.setRotationPoint(0.5F, 18F, 0.5F);
		Shape5k.setTextureSize(128, 128);
		Shape5k.mirror = true;
		this.setRotation(Shape5k, 0F, 0F, 0F);
		Shape5l = new LODModelPart(this, 0, 59);
		Shape5l.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape5l.setRotationPoint(0.5F, 18F, -5.5F);
		Shape5l.setTextureSize(128, 128);
		Shape5l.mirror = true;
		this.setRotation(Shape5l, 0F, 0F, 0F);
		Shape5m = new LODModelPart(this, 0, 59);
		Shape5m.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape5m.setRotationPoint(-2.5F, 18F, 3.5F);
		Shape5m.setTextureSize(128, 128);
		Shape5m.mirror = true;
		this.setRotation(Shape5m, 0F, 0F, 0F);
		Shape5n = new LODModelPart(this, 0, 59);
		Shape5n.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape5n.setRotationPoint(-2.5F, 18F, 0.5F);
		Shape5n.setTextureSize(128, 128);
		Shape5n.mirror = true;
		this.setRotation(Shape5n, 0F, 0F, 0F);
		Shape5o = new LODModelPart(this, 0, 59);
		Shape5o.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape5o.setRotationPoint(-2.5F, 18F, -5.5F);
		Shape5o.setTextureSize(128, 128);
		Shape5o.mirror = true;
		this.setRotation(Shape5o, 0F, 0F, 0F);
		Shape7 = new LODModelPart(this, 0, 65);
		Shape7.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape7.setRotationPoint(4F, 16.2F, -7F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		this.setRotation(Shape7, 0F, 0F, 0F);
		Shape7a = new LODModelPart(this, 0, 65);
		Shape7a.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape7a.setRotationPoint(-3.5F, 16.2F, -7F);
		Shape7a.setTextureSize(128, 128);
		Shape7a.mirror = true;
		this.setRotation(Shape7a, 0F, 0F, 0F);
		Shape7b = new LODModelPart(this, 0, 65);
		Shape7b.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape7b.setRotationPoint(1F, 16.2F, -7F);
		Shape7b.setTextureSize(128, 128);
		Shape7b.mirror = true;
		this.setRotation(Shape7b, 0F, 0F, 0F);
		Shape7c = new LODModelPart(this, 0, 65);
		Shape7c.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape7c.setRotationPoint(-5F, 16.2F, -7F);
		Shape7c.setTextureSize(128, 128);
		Shape7c.mirror = true;
		this.setRotation(Shape7c, 0F, 0F, 0F);
		Shape7d = new LODModelPart(this, 0, 65);
		Shape7d.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape7d.setRotationPoint(-6.5F, 16.2F, -7F);
		Shape7d.setTextureSize(128, 128);
		Shape7d.mirror = true;
		this.setRotation(Shape7d, 0F, 0F, 0F);
		Shape7e = new LODModelPart(this, 0, 65);
		Shape7e.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape7e.setRotationPoint(5.5F, 16.2F, -7F);
		Shape7e.setTextureSize(128, 128);
		Shape7e.mirror = true;
		this.setRotation(Shape7e, 0F, 0F, 0F);
		Shape7f = new LODModelPart(this, 0, 65);
		Shape7f.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape7f.setRotationPoint(2.5F, 16.2F, -7F);
		Shape7f.setTextureSize(128, 128);
		Shape7f.mirror = true;
		this.setRotation(Shape7f, 0F, 0F, 0F);
		Shape7g = new LODModelPart(this, 0, 65);
		Shape7g.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape7g.setRotationPoint(-2F, 16.2F, -7F);
		Shape7g.setTextureSize(128, 128);
		Shape7g.mirror = true;
		this.setRotation(Shape7g, 0F, 0F, 0F);
		Shape7h = new LODModelPart(this, 0, 65);
		Shape7h.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape7h.setRotationPoint(-0.5F, 16.2F, -7F);
		Shape7h.setTextureSize(128, 128);
		Shape7h.mirror = true;
		this.setRotation(Shape7h, 0F, 0F, 0F);
		Shape6 = new LODModelPart(this, 0, 80);
		Shape6.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape6.setRotationPoint(-7F, 16.3F, -4F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0F);
		Shape6a = new LODModelPart(this, 0, 80);
		Shape6a.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape6a.setRotationPoint(-7F, 16.3F, -0.5F);
		Shape6a.setTextureSize(128, 128);
		Shape6a.mirror = true;
		this.setRotation(Shape6a, 0F, 0F, 0F);
		Shape6b = new LODModelPart(this, 0, 80);
		Shape6b.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape6b.setRotationPoint(-7F, 16.3F, 3F);
		Shape6b.setTextureSize(128, 128);
		Shape6b.mirror = true;
		this.setRotation(Shape6b, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		Shape1.render(te, f5);
		Shape2.render(te, f5);
		Shape2a.render(te, f5);
		Shape3.render(te, f5);
		Shape3a.render(te, f5);
		Shape4.render(te, f5);
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
		Shape7.render(te, f5);
		Shape7a.render(te, f5);
		Shape7b.render(te, f5);
		Shape7c.render(te, f5);
		Shape7d.render(te, f5);
		Shape7e.render(te, f5);
		Shape7f.render(te, f5);
		Shape7g.render(te, f5);
		Shape7h.render(te, f5);
		Shape6.render(te, f5);
		Shape6a.render(te, f5);
		Shape6b.render(te, f5);
	}

}