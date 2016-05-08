/**
 * @author 何广军
 *
 * 2015-8-31
 */
package com.dhy.mp3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

/**
 * 系统启动界面
 */
public class StartActivity extends Activity {
	public static Context context; // 上下文环境变量

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// requestWindowFeature(Window.FEATURE_NO_TITLE);  // 隐藏标题
		setContentView(R.layout.start_layout); // 界面初始化
		context = this;
		init(); // 参数初始化
	}

	private void init() {
		Intent intent = new Intent(context,Mp3ListActivity.class);
		startActivity(intent);
	}

}