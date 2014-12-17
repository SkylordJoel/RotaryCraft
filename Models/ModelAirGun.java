/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 02/11/2013 12:00:46 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

public class ModelAirGun extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape2;
	LODModelPart Shape1a;
	LODModelPart Shape1b;
	LODModelPart Shape1c;
	LODModelPart Shape2a;
	LODModelPart Shape3;
	LODModelPart Shape4;
	LODModelPart Shape4a;
	LODModelPart Shape5;
	LODModelPart Shape6;
	LODModelPart Shape6a;
	LODModelPart Shape7;
	LODModelPart Shape7a;
	LODModelPart Shape7b;
	LODModelPart Shape7c;
	LODModelPart Shape7d;
	LODModelPart Shape7e;
	LODModelPart Shape7f;
	LODModelPart Shape8;
	LODModelPart Shape9;
	LODModelPart Shape9a;
	LODModelPart Shape3a;
	LODModelPart Shape10;
	LODModelPart Shape10a;
	LODModelPart Shape10b;
	LODModelPart Shape10c;
	LODModelPart Shape10d;
	LODModelPart Shape10e;
	LODModelPart Shape10f;
	LODModelPart Shape10g;
	LODModelPart Shape7g;
	LODModelPart Shape7h;
	LODModelPart Shape7i;
	LODModelPart Shape7j;
	LODModelPart Shape7k;
	LODModelPart Shape7l;
	LODModelPart Shape7m;
	LODModelPart Shape7n;
	LODModelPart Shape7o;
	LODModelPart Shape11;
	LODModelPart Shape11a;
	LODModelPart Shape12;
	LODModelPart Shape12a;
	LODModelPart Shape13;

	public ModelAirGun()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 0, 10);
		Shape1.addBox(-6F, 0F, -1F, 12, 7, 1);
		Shape1.setRotationPoint(0F, 15F, -3F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, -2.356194F, 0F, 0F);
		Shape2 = new LODModelPart(this, 55, 0);
		Shape2.addBox(0F, 0F, 0F, 16, 3, 13);
		Shape2.setRotationPoint(-8F, 8F, -8F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape1a = new LODModelPart(this, 12, 19);
		Shape1a.addBox(-6F, -6F, 0F, 7, 12, 1);
		Shape1a.setRotationPoint(0F, 15F, -3F);
		Shape1a.setTextureSize(128, 128);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0F, -0.7853982F, 0F);
		Shape1b = new LODModelPart(this, 0, 0);
		Shape1b.addBox(-6F, 0F, 0F, 12, 7, 1);
		Shape1b.setRotationPoint(0F, 15F, -3F);
		Shape1b.setTextureSize(128, 128);
		Shape1b.mirror = true;
		this.setRotation(Shape1b, -0.7853982F, 0F, 0F);
		Shape1c = new LODModelPart(this, 29, 19);
		Shape1c.addBox(-1F, -6F, 0F, 7, 12, 1);
		Shape1c.setRotationPoint(0F, 15F, -3F);
		Shape1c.setTextureSize(128, 128);
		Shape1c.mirror = true;
		this.setRotation(Shape1c, 0F, 0.7853982F, 0F);
		Shape2a = new LODModelPart(this, 55, 20);
		Shape2a.addBox(0F, 0F, 0F, 16, 3, 13);
		Shape2a.setRotationPoint(-8F, 21F, -8F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 0, 20);
		Shape3.addBox(-1F, -1F, 0F, 2, 2, 3);
		Shape3.setRotationPoint(0F, 15F, -4.9F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0.7853982F);
		Shape4 = new LODModelPart(this, 0, 33);
		Shape4.addBox(0F, 0F, 0F, 3, 10, 13);
		Shape4.setRotationPoint(5F, 11F, -8F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape4a = new LODModelPart(this, 0, 59);
		Shape4a.addBox(0F, 0F, 0F, 3, 10, 13);
		Shape4a.setRotationPoint(-8F, 11F, -8F);
		Shape4a.setTextureSize(128, 128);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, 0F, 0F, 0F);
		Shape5 = new LODModelPart(this, 36, 38);
		Shape5.addBox(0F, 0F, 0F, 10, 10, 1);
		Shape5.setRotationPoint(-5F, 11F, -2F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new LODModelPart(this, 0, 86);
		Shape6.addBox(-1F, -1F, 0F, 2, 2, 10);
		Shape6.setRotationPoint(0F, 15F, -1.5F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0.7853982F);
		Shape6a = new LODModelPart(this, 0, 86);
		Shape6a.addBox(-1F, -1F, 0F, 2, 2, 10);
		Shape6a.setRotationPoint(0F, 15F, -1.5F);
		Shape6a.setTextureSize(128, 128);
		Shape6a.mirror = true;
		this.setRotation(Shape6a, 0F, 0F, 0F);
		Shape7 = new LODModelPart(this, 47, 0);
		Shape7.addBox(-0.5F, -6F, 0F, 1, 12, 1);
		Shape7.setRotationPoint(0F, 15F, 6F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		this.setRotation(Shape7, 0F, 0F, 0.0872665F);
		Shape7a = new LODModelPart(this, 47, 0);
		Shape7a.addBox(-0.5F, -6F, 0F, 1, 12, 1);
		Shape7a.setRotationPoint(0F, 15F, 6F);
		Shape7a.setTextureSize(128, 128);
		Shape7a.mirror = true;
		this.setRotation(Shape7a, 0F, 0F, 0.8726646F);
		Shape7b = new LODModelPart(this, 47, 0);
		Shape7b.addBox(-0.5F, -6F, 0F, 1, 12, 1);
		Shape7b.setRotationPoint(0F, 15F, 6F);
		Shape7b.setTextureSize(128, 128);
		Shape7b.mirror = true;
		this.setRotation(Shape7b, 0F, 0F, 0.4799655F);
		Shape7c = new LODModelPart(this, 47, 0);
		Shape7c.addBox(-0.5F, -6F, 0F, 1, 12, 1);
		Shape7c.setRotationPoint(0F, 15F, 6F);
		Shape7c.setTextureSize(128, 128);
		Shape7c.mirror = true;
		this.setRotation(Shape7c, 0F, 0F, 1.265364F);
		Shape7d = new LODModelPart(this, 47, 0);
		Shape7d.addBox(-0.5F, -6F, 0F, 1, 12, 1);
		Shape7d.setRotationPoint(0F, 15F, 6F);
		Shape7d.setTextureSize(128, 128);
		Shape7d.mirror = true;
		this.setRotation(Shape7d, 0F, 0F, 1.658063F);
		Shape7e = new LODModelPart(this, 47, 0);
		Shape7e.addBox(-0.5F, -6F, 0F, 1, 12, 1);
		Shape7e.setRotationPoint(0F, 15F, 6F);
		Shape7e.setTextureSize(128, 128);
		Shape7e.mirror = true;
		this.setRotation(Shape7e, 0F, 0F, 2.443461F);
		Shape7f = new LODModelPart(this, 47, 0);
		Shape7f.addBox(-0.5F, -6F, 0F, 1, 12, 1);
		Shape7f.setRotationPoint(0F, 15F, 6F);
		Shape7f.setTextureSize(128, 128);
		Shape7f.mirror = true;
		this.setRotation(Shape7f, 0F, 0F, 2.050762F);
		Shape8 = new LODModelPart(this, 0, 101);
		Shape8.addBox(0F, 0F, 0F, 10, 2, 1);
		Shape8.setRotationPoint(-5F, 19F, -8F);
		Shape8.setTextureSize(128, 128);
		Shape8.mirror = true;
		this.setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new LODModelPart(this, 34, 0);
		Shape9.addBox(0F, 0F, 0F, 1, 8, 1);
		Shape9.setRotationPoint(4F, 11F, -8F);
		Shape9.setTextureSize(128, 128);
		Shape9.mirror = true;
		this.setRotation(Shape9, 0F, 0F, 0F);
		Shape9a = new LODModelPart(this, 28, 0);
		Shape9a.addBox(0F, 0F, 0F, 1, 8, 1);
		Shape9a.setRotationPoint(-5F, 11F, -8F);
		Shape9a.setTextureSize(128, 128);
		Shape9a.mirror = true;
		this.setRotation(Shape9a, 0F, 0F, 0F);
		Shape3a = new LODModelPart(this, 0, 26);
		Shape3a.addBox(-1F, -1F, 0F, 2, 2, 3);
		Shape3a.setRotationPoint(0F, 15F, -5F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0F);
		Shape10 = new LODModelPart(this, 22, 116);
		Shape10.addBox(0F, 0F, 0F, 2, 1, 7);
		Shape10.setRotationPoint(-4F, 20F, -2F);
		Shape10.setTextureSize(128, 128);
		Shape10.mirror = true;
		this.setRotation(Shape10, 0F, 0F, 0F);
		Shape10a = new LODModelPart(this, 0, 106);
		Shape10a.addBox(0F, 0F, 0F, 2, 1, 7);
		Shape10a.setRotationPoint(-4F, 11F, -2F);
		Shape10a.setTextureSize(128, 128);
		Shape10a.mirror = true;
		this.setRotation(Shape10a, 0F, 0F, 0F);
		Shape10b = new LODModelPart(this, 62, 116);
		Shape10b.addBox(0F, 0F, 0F, 1, 3, 7);
		Shape10b.setRotationPoint(4F, 18F, -2F);
		Shape10b.setTextureSize(128, 128);
		Shape10b.mirror = true;
		this.setRotation(Shape10b, 0F, 0F, 0F);
		Shape10c = new LODModelPart(this, 22, 106);
		Shape10c.addBox(0F, 0F, 0F, 2, 1, 7);
		Shape10c.setRotationPoint(2F, 20F, -2F);
		Shape10c.setTextureSize(128, 128);
		Shape10c.mirror = true;
		this.setRotation(Shape10c, 0F, 0F, 0F);
		Shape10d = new LODModelPart(this, 0, 116);
		Shape10d.addBox(0F, 0F, 0F, 2, 1, 7);
		Shape10d.setRotationPoint(2F, 11F, -2F);
		Shape10d.setTextureSize(128, 128);
		Shape10d.mirror = true;
		this.setRotation(Shape10d, 0F, 0F, 0F);
		Shape10e = new LODModelPart(this, 43, 116);
		Shape10e.addBox(0F, 0F, 0F, 1, 3, 7);
		Shape10e.setRotationPoint(4F, 11F, -2F);
		Shape10e.setTextureSize(128, 128);
		Shape10e.mirror = true;
		this.setRotation(Shape10e, 0F, 0F, 0F);
		Shape10f = new LODModelPart(this, 43, 104);
		Shape10f.addBox(0F, 0F, 0F, 1, 3, 7);
		Shape10f.setRotationPoint(-5F, 11F, -2F);
		Shape10f.setTextureSize(128, 128);
		Shape10f.mirror = true;
		this.setRotation(Shape10f, 0F, 0F, 0F);
		Shape10g = new LODModelPart(this, 62, 104);
		Shape10g.addBox(0F, 0F, 0F, 1, 3, 7);
		Shape10g.setRotationPoint(-5F, 18F, -2F);
		Shape10g.setTextureSize(128, 128);
		Shape10g.mirror = true;
		this.setRotation(Shape10g, 0F, 0F, 0F);
		Shape7g = new LODModelPart(this, 47, 0);
		Shape7g.addBox(-0.5F, -6F, 0F, 1, 12, 1);
		Shape7g.setRotationPoint(0F, 15F, 5F);
		Shape7g.setTextureSize(128, 128);
		Shape7g.mirror = true;
		this.setRotation(Shape7g, 0F, 0F, 1.178097F);
		Shape7h = new LODModelPart(this, 47, 0);
		Shape7h.addBox(-0.5F, -6F, 0F, 1, 12, 1);
		Shape7h.setRotationPoint(0F, 15F, 5F);
		Shape7h.setTextureSize(128, 128);
		Shape7h.mirror = true;
		this.setRotation(Shape7h, 0F, 0F, 1.570796F);
		Shape7i = new LODModelPart(this, 47, 0);
		Shape7i.addBox(-0.5F, -6F, 0F, 1, 12, 1);
		Shape7i.setRotationPoint(0F, 15F, 5F);
		Shape7i.setTextureSize(128, 128);
		Shape7i.mirror = true;
		this.setRotation(Shape7i, 0F, 0F, 1.963495F);
		Shape7j = new LODModelPart(this, 47, 0);
		Shape7j.addBox(-0.5F, -6F, 0F, 1, 12, 1);
		Shape7j.setRotationPoint(0F, 15F, 5F);
		Shape7j.setTextureSize(128, 128);
		Shape7j.mirror = true;
		this.setRotation(Shape7j, 0F, 0F, 2.356194F);
		Shape7k = new LODModelPart(this, 47, 0);
		Shape7k.addBox(-0.5F, -6F, 0F, 1, 12, 1);
		Shape7k.setRotationPoint(0F, 15F, 5F);
		Shape7k.setTextureSize(128, 128);
		Shape7k.mirror = true;
		this.setRotation(Shape7k, 0F, 0F, 2.748893F);
		Shape7l = new LODModelPart(this, 47, 0);
		Shape7l.addBox(-0.5F, -6F, 0F, 1, 12, 1);
		Shape7l.setRotationPoint(0F, 15F, 5F);
		Shape7l.setTextureSize(128, 128);
		Shape7l.mirror = true;
		this.setRotation(Shape7l, 0F, 0F, 0F);
		Shape7m = new LODModelPart(this, 47, 0);
		Shape7m.addBox(-0.5F, -6F, 0F, 1, 12, 1);
		Shape7m.setRotationPoint(0F, 15F, 6F);
		Shape7m.setTextureSize(128, 128);
		Shape7m.mirror = true;
		this.setRotation(Shape7m, 0F, 0F, 2.83616F);
		Shape7n = new LODModelPart(this, 47, 0);
		Shape7n.addBox(-0.5F, -6F, 0F, 1, 12, 1);
		Shape7n.setRotationPoint(0F, 15F, 5F);
		Shape7n.setTextureSize(128, 128);
		Shape7n.mirror = true;
		this.setRotation(Shape7n, 0F, 0F, 0.3926991F);
		Shape7o = new LODModelPart(this, 47, 0);
		Shape7o.addBox(-0.5F, -6F, 0F, 1, 12, 1);
		Shape7o.setRotationPoint(0F, 15F, 5F);
		Shape7o.setTextureSize(128, 128);
		Shape7o.mirror = true;
		this.setRotation(Shape7o, 0F, 0F, 0.7853982F);
		Shape11 = new LODModelPart(this, 47, 16);
		Shape11.addBox(0F, 0F, 0F, 1, 16, 2);
		Shape11.setRotationPoint(7F, 8F, 5F);
		Shape11.setTextureSize(128, 128);
		Shape11.mirror = true;
		this.setRotation(Shape11, 0F, 0F, 0F);
		Shape11a = new LODModelPart(this, 47, 16);
		Shape11a.addBox(0F, 0F, 0F, 1, 16, 2);
		Shape11a.setRotationPoint(-8F, 8F, 5F);
		Shape11a.setTextureSize(128, 128);
		Shape11a.mirror = true;
		this.setRotation(Shape11a, 0F, 0F, 0F);
		Shape12 = new LODModelPart(this, 60, 38);
		Shape12.addBox(0F, 0F, 0F, 14, 1, 2);
		Shape12.setRotationPoint(-7F, 23F, 5F);
		Shape12.setTextureSize(128, 128);
		Shape12.mirror = true;
		this.setRotation(Shape12, 0F, 0F, 0F);
		Shape12a = new LODModelPart(this, 60, 38);
		Shape12a.addBox(0F, 0F, 0F, 14, 1, 2);
		Shape12a.setRotationPoint(-7F, 8F, 5F);
		Shape12a.setTextureSize(128, 128);
		Shape12a.mirror = true;
		this.setRotation(Shape12a, 0F, 0F, 0F);
		Shape13 = new LODModelPart(this, 34, 51);
		Shape13.addBox(0F, 0F, 0F, 16, 16, 1);
		Shape13.setRotationPoint(-8F, 8F, 7F);
		Shape13.setTextureSize(128, 128);
		Shape13.mirror = true;
		this.setRotation(Shape13, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		Shape1.render(te, f5);
		Shape2.render(te, f5);
		Shape1a.render(te, f5);
		Shape1b.render(te, f5);
		Shape1c.render(te, f5);
		Shape2a.render(te, f5);
		Shape3.render(te, f5);
		Shape4.render(te, f5);
		Shape4a.render(te, f5);
		Shape5.render(te, f5);
		Shape8.render(te, f5);
		Shape9.render(te, f5);
		Shape9a.render(te, f5);
		Shape3a.render(te, f5);
		Shape10.render(te, f5);
		Shape10a.render(te, f5);
		Shape10b.render(te, f5);
		Shape10c.render(te, f5);
		Shape10d.render(te, f5);
		Shape10e.render(te, f5);
		Shape10f.render(te, f5);
		Shape10g.render(te, f5);
		Shape11.render(te, f5);
		Shape11a.render(te, f5);
		Shape12.render(te, f5);
		Shape12a.render(te, f5);
		Shape13.render(te, f5);

		double d = 0.9375;
		GL11.glTranslated(0, d, 0);
		GL11.glRotatef(phi, 0, 0, 1);
		GL11.glTranslated(0, -d, 0);
		Shape6.render(te, f5);
		Shape6a.render(te, f5);
		Shape7g.render(te, f5);
		Shape7h.render(te, f5);
		Shape7i.render(te, f5);
		Shape7j.render(te, f5);
		Shape7k.render(te, f5);
		Shape7l.render(te, f5);
		Shape7m.render(te, f5);
		Shape7n.render(te, f5);
		Shape7o.render(te, f5);
		Shape7.render(te, f5);
		Shape7a.render(te, f5);
		Shape7b.render(te, f5);
		Shape7c.render(te, f5);
		Shape7d.render(te, f5);
		Shape7e.render(te, f5);
		Shape7f.render(te, f5);
		GL11.glTranslated(0, d, 0);
		GL11.glRotatef(-phi, 0, 0, 1);
		GL11.glTranslated(0, -d, 0);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}