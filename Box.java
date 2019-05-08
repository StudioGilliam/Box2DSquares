package com.suchuu.box2dsquares;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.graphics.glutils.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.*;
import com.badlogic.gdx.math.*;
import java.util.*;
import com.badlogic.gdx.scenes.scene2d.*;
import com.badlogic.gdx.scenes.scene2d.utils.*;

public class Box extends Actor
{
	private MyGdxGame game;
	ShapeRenderer renderer;
	private Vector3 color;
	
	public Box(MyGdxGame game) {
		super();
		this.game = game;
		renderer = new ShapeRenderer();
		
		setPosition(300, 300);
		setBounds(300, 300, 600, 500);
		
		color = new Vector3();
		changeColor();
		
		this.setTouchable(Touchable.enabled);
		
		this.addListener(new ClickListener() {
			@Override
			public boolean touchDown(InputEvent event, float x, float y, int button, int pointer) {
				changeColor();
				event.handle();
				return false;
			}
		});
	}
	
	private void changeColor() {
		Random rng = new Random();
		color.x = rng.nextInt(255) / 255f;
		color.y = rng.nextInt(255) / 255f;
		color.z = rng.nextInt(255) / 255f;
	}

	@Override
	public void draw(Batch batch, float parentAlpha) {
		super.draw(batch, parentAlpha);
		
		renderer.begin();
		renderer.set(ShapeRenderer.ShapeType.Filled);
		renderer.setColor(color.x, color.y, color.z, 1);
		renderer.rect(getX(), getY(), getWidth(), getHeight());
		renderer.end();
	}
	
	public void dispose() {
		renderer.dispose();
	}
}
