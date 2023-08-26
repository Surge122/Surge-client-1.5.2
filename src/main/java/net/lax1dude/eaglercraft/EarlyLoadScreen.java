package net.lax1dude.eaglercraft;

import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wGL_ARRAY_BUFFER;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wGL_CLAMP;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wGL_COLOR_BUFFER_BIT;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wGL_DEPTH_BUFFER_BIT;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wGL_FLOAT;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wGL_FRAGMENT_SHADER;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wGL_NEAREST;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wGL_RGBA;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wGL_STATIC_DRAW;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wGL_TEXTURE0;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wGL_TEXTURE_2D;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wGL_TEXTURE_MAG_FILTER;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wGL_TEXTURE_MIN_FILTER;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wGL_TEXTURE_WRAP_S;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wGL_TEXTURE_WRAP_T;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wGL_TRIANGLES;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wGL_UNSIGNED_BYTE;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wGL_VERTEX_SHADER;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wgetShaderHeader;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglActiveTexture;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglAttachShader;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglBindAttributeLocation;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglBindBuffer;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglBindTexture;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglBindVertexArray;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglBufferData0;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglClear;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglClearColor;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglCompileShader;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglCreateBuffer;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglCreateProgram;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglCreateShader;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglCreateVertexArray;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglDeleteShader;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglDeleteTextures;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglDeleteVertexArray;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglDetachShader;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglDisableVertexAttribArray;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglDrawArrays;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglEnableVertexAttribArray;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglFlush;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglGenTextures;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglGetUniformLocation;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglLinkProgram;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglShaderSource;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglTexImage2D;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglTexParameteri;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglUniform1i;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglUniform2f;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglUseProgram;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglVertexAttribPointer;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2._wglViewport;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2.getCanvasHeight;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2.getCanvasWidth;
import static net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2.updateDisplay;

import java.nio.IntBuffer;



import org.teavm.jso.browser.Window;

import org.teavm.jso.dom.html.HTMLDocument;
import org.teavm.jso.dom.html.HTMLElement;


import net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2.BufferArrayGL;
import net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2.BufferGL;
import net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2.ProgramGL;
import net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2.ShaderGL;
import net.lax1dude.eaglercraft.adapter.EaglerAdapterImpl2.TextureGL;
import net.minecraft.src.GLAllocation;

public class EarlyLoadScreen {
	
	public static final String loadScreen = "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";
	public static final String enableScreen = "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";

	private static BufferGL vbo = null;
	private static ProgramGL program = null;
	
	public static void paintScreen() {
		HTMLDocument docElem = Window.current().getDocument();
		HTMLElement bodyElem = docElem.getBody();
		//Window.alert("test");
		HTMLElement imgElem = docElem.createElement("img");
		HTMLElement divElem = docElem.createElement("div");
		imgElem.setAttribute("src", "./koneClientHd.png");
		imgElem.setAttribute("style", "width:50vw; position:absolute; top: 43vh; left: 50vw; transform: translate(-50%, -50%);");
		divElem.setAttribute("style", "z-index:100; width: 100vw; height: 100vh; position: absolute; top: 0px; left: 0px; background-color: white;");
		divElem.setAttribute("id", "loadDiv");
		bodyElem.appendChild(divElem);
		divElem.appendChild(imgElem);
		HTMLElement divElemLoadBar = docElem.createElement("div");
		divElemLoadBar.setAttribute("style", "width: 80vw; height: 25px; position: absolute; top: 80vh; left: 50vw; transform: translateX(-50%); background-color: white; border-radius: 25px; border: solid 5px black;");
		divElem.appendChild(divElemLoadBar);
		HTMLElement divElemLoadBarInside = docElem.createElement("div");
		divElemLoadBarInside.setAttribute("style", "width: 0px; height: 35px; position: absolute; top: 80vh; left: 10vw; background-color: black; border-radius: 25px; transition: width 2s linear;");
		divElemLoadBarInside.setAttribute("id", "loadBarInside");
		divElem.appendChild(divElemLoadBarInside);
		HTMLElement scriptTransitionWait = docElem.createElement("script");
		scriptTransitionWait.setInnerHTML("setTimeout(() => {document.getElementById(\"loadBarInside\").style.width = \"80.1vw\"}, 1);");
		divElem.appendChild(scriptTransitionWait);

		TextureGL tex = _wglGenTextures();
		_wglActiveTexture(_wGL_TEXTURE0);
		_wglBindTexture(_wGL_TEXTURE_2D, tex);
		_wglTexParameteri(_wGL_TEXTURE_2D, _wGL_TEXTURE_MAG_FILTER, _wGL_NEAREST);
		_wglTexParameteri(_wGL_TEXTURE_2D, _wGL_TEXTURE_MIN_FILTER, _wGL_NEAREST);
		_wglTexParameteri(_wGL_TEXTURE_2D, _wGL_TEXTURE_WRAP_S, _wGL_CLAMP);
		_wglTexParameteri(_wGL_TEXTURE_2D, _wGL_TEXTURE_WRAP_T, _wGL_CLAMP);
		//EaglerImage img = EaglerImage.loadImage(Base64.decodeBase64(loadScreen));
		EaglerImage img = EaglerAdapter.loadPNG(Base64.decodeBase64(loadScreen));
		IntBuffer upload = GLAllocation.createDirectIntBuffer(192*192);
		upload.put(img.data);
		upload.flip();
		_wglTexImage2D(_wGL_TEXTURE_2D, 0, _wGL_RGBA, 192, 192, 0, _wGL_RGBA, _wGL_UNSIGNED_BYTE, upload);
		
		upload.clear();
		upload.put(Float.floatToIntBits(0.0f)); upload.put(Float.floatToIntBits(0.0f));
		upload.put(Float.floatToIntBits(0.0f)); upload.put(Float.floatToIntBits(1.0f));
		upload.put(Float.floatToIntBits(1.0f)); upload.put(Float.floatToIntBits(0.0f));
		upload.put(Float.floatToIntBits(1.0f)); upload.put(Float.floatToIntBits(0.0f));
		upload.put(Float.floatToIntBits(0.0f)); upload.put(Float.floatToIntBits(1.0f));
		upload.put(Float.floatToIntBits(1.0f)); upload.put(Float.floatToIntBits(1.0f));
		upload.flip();
			
		vbo = _wglCreateBuffer();
		_wglBindBuffer(_wGL_ARRAY_BUFFER, vbo);
		_wglBufferData0(_wGL_ARRAY_BUFFER, upload, _wGL_STATIC_DRAW);

		ShaderGL vert = _wglCreateShader(_wGL_VERTEX_SHADER);
		_wglShaderSource(vert, _wgetShaderHeader()+"\nprecision lowp float; in vec2 a_pos; out vec2 v_pos; void main() { gl_Position = vec4(((v_pos = a_pos) - 0.5) * vec2(2.0, -2.0), 0.0, 1.0); }");
		_wglCompileShader(vert);
		
		ShaderGL frag = _wglCreateShader(_wGL_FRAGMENT_SHADER);
		_wglShaderSource(frag, _wgetShaderHeader()+"\nprecision lowp float; in vec2 v_pos; out vec4 fragColor; uniform sampler2D tex; uniform vec2 aspect; void main() { fragColor = vec4(texture(tex, clamp(v_pos * aspect - ((aspect - 1.0) * 0.5), 0.02, 0.98)).rgb, 1.0); }");
		_wglCompileShader(frag);
		
		program = _wglCreateProgram();
		
		_wglAttachShader(program, vert);
		_wglAttachShader(program, frag);
		_wglBindAttributeLocation(program, 0, "a_pos");
		_wglLinkProgram(program);
		_wglDetachShader(program, vert);
		_wglDetachShader(program, frag);
		_wglDeleteShader(vert);
		_wglDeleteShader(frag);
		
		try {
			Thread.sleep(50l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		_wglUseProgram(program);
		_wglUniform1i(_wglGetUniformLocation(program, "tex"), 0);

		int width = getCanvasWidth();
		int height = getCanvasHeight();
		float x, y;
		if(width > height) {
			x = (float)width / (float)height;
			y = 1.0f;
		}else {
			x = 1.0f;
			y = (float)height / (float)width;
		}
		
		_wglActiveTexture(_wGL_TEXTURE0);
		_wglBindTexture(_wGL_TEXTURE_2D, tex);
		
		_wglViewport(0, 0, width, height);
		_wglClearColor(1.0f, 1.0f, 1.0f, 1.0f);
		_wglClear(_wGL_COLOR_BUFFER_BIT | _wGL_DEPTH_BUFFER_BIT);
		
		_wglUniform2f(_wglGetUniformLocation(program, "aspect"), x, y);
		
		BufferArrayGL vao = _wglCreateVertexArray();
		_wglBindVertexArray(vao);
		_wglEnableVertexAttribArray(0);
		_wglVertexAttribPointer(0, 2, _wGL_FLOAT, false, 8, 0);
		_wglDrawArrays(_wGL_TRIANGLES, 0, 6);
		_wglDisableVertexAttribArray(0);
		_wglFlush();
		updateDisplay();

		_wglUseProgram(null);
		_wglBindBuffer(_wGL_ARRAY_BUFFER, null);
		_wglBindTexture(_wGL_TEXTURE_2D, null);
		_wglDeleteTextures(tex);
		_wglDeleteVertexArray(vao);
		
	}
	
	public static void paintEnable() {
		
		TextureGL tex = _wglGenTextures();
		_wglActiveTexture(_wGL_TEXTURE0);
		_wglBindTexture(_wGL_TEXTURE_2D, tex);
		_wglTexParameteri(_wGL_TEXTURE_2D, _wGL_TEXTURE_MAG_FILTER, _wGL_NEAREST);
		_wglTexParameteri(_wGL_TEXTURE_2D, _wGL_TEXTURE_MIN_FILTER, _wGL_NEAREST);
		_wglTexParameteri(_wGL_TEXTURE_2D, _wGL_TEXTURE_WRAP_S, _wGL_CLAMP);
		_wglTexParameteri(_wGL_TEXTURE_2D, _wGL_TEXTURE_WRAP_T, _wGL_CLAMP);
		//EaglerImage img = EaglerImage.loadImage(Base64.decodeBase64(enableScreen));
		EaglerImage img = EaglerAdapter.loadPNG(Base64.decodeBase64(enableScreen));
		IntBuffer upload = GLAllocation.createDirectIntBuffer(128*128);
		upload.put(img.data);
		upload.flip();
		_wglTexImage2D(_wGL_TEXTURE_2D, 0, _wGL_RGBA, 128, 128, 0, _wGL_RGBA, _wGL_UNSIGNED_BYTE, upload);
		
		try {
			Thread.sleep(50l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


		
		HTMLDocument docElem = Window.current().getDocument();
		HTMLElement bodyElem = docElem.getBody();
		HTMLElement loadDiv = docElem.getElementById("loadDiv");
		bodyElem.removeChild(loadDiv);
		


		
		_wglUseProgram(program);

		int width = getCanvasWidth();
		int height = getCanvasHeight();
		float x, y;
		if(width > height) {
			x = (float)width / (float)height;
			y = 1.0f;
		}else {
			x = 1.0f;
			y = (float)height / (float)width;
		}
		
		_wglActiveTexture(_wGL_TEXTURE0);
		_wglBindTexture(_wGL_TEXTURE_2D, tex);
		
		_wglViewport(0, 0, width, height);
		_wglClearColor(1.0f, 1.0f, 1.0f, 1.0f);
		_wglClear(_wGL_COLOR_BUFFER_BIT | _wGL_DEPTH_BUFFER_BIT);
		
		_wglUniform2f(_wglGetUniformLocation(program, "aspect"), x, y);

		BufferArrayGL vao = _wglCreateVertexArray();
		_wglBindVertexArray(vao);
		_wglBindBuffer(_wGL_ARRAY_BUFFER, vbo);
		_wglEnableVertexAttribArray(0);
		_wglVertexAttribPointer(0, 2, _wGL_FLOAT, false, 8, 0);
		_wglDrawArrays(_wGL_TRIANGLES, 0, 6);
		_wglDisableVertexAttribArray(0);
		_wglFlush();
		updateDisplay();

		_wglUseProgram(null);
		_wglBindBuffer(_wGL_ARRAY_BUFFER, null);
		_wglBindTexture(_wGL_TEXTURE_2D, null);
		_wglDeleteTextures(tex);
		_wglDeleteVertexArray(vao);
		
	}
	
}
