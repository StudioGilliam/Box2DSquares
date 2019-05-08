package com.suchuu.box2dsquares;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.graphics.glutils.*;
import com.badlogic.gdx.scenes.scene2d.*;
import com.badlogic.gdx.scenes.scene2d.utils.*;

public class MyGdxGame implements ApplicationListener {
	// private ShapeRenderer renderer;
	// public OrthographicCamera camera;
	
	private Stage stage;

	@Override
	public void create() {
		// renderer = new ShapeRenderer();
		// camera = new OrthographicCamera();
		// camera.setToOrtho(false, Gdx.graphics.getWidth(),  Gdx.graphics.getHeight());
		
		Box box = new Box(this);
		
		stage = new Stage();
		
		Gdx.input.setInputProcessor(stage);
		
		stage.addActor(box);
	}

	@Override
	public void render() {        
	    Gdx.gl.glClearColor(1, 1, 1, 1);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		// camera.update();
		
		/*
		renderer.begin(ShapeRenderer.ShapeType.Filled);
		renderer.setColor(Color.BLACK);
		renderer.rect(0, 0, 300, 200);
		renderer.end();
		*/
		
		stage.act();
		stage.draw();
		
		// box.update();
		// box.render(renderer);
		
		
	}

	@Override
	public void dispose() {
		// renderer.dispose();
	}

	@Override
	public void resize(int width, int height) {}

	@Override
	public void pause() {}

	@Override
	public void resume() {}
}
