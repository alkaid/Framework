package com.alkaid.base.extern.baseView;

import com.alkaid.base.view.base.BActivity;
import com.alkaid.base.view.base.BContextWrap;

public class BaseActivity extends BActivity {
	private BaseContextWrap baseContextWrap;
	protected BaseApp baseApp;
	@Override
	protected BContextWrap createContextWrap() {
		baseContextWrap=BaseContextWrap.wrap(context);
		baseApp=baseContextWrap.baseApp;
		return baseContextWrap;
	}
}
