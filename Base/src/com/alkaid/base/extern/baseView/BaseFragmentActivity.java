package com.alkaid.base.extern.baseView;

import com.alkaid.base.view.base.BContextWrap;
import com.alkaid.base.view.base.BFragmentActivity;

public class BaseFragmentActivity extends BFragmentActivity {
	private BaseContextWrap baseContextWrap;
	protected BaseApp baseApp;
	@Override
	protected BContextWrap createContextWrap() {
		baseContextWrap=BaseContextWrap.wrap(context);
		baseApp=baseContextWrap.baseApp;
		return baseContextWrap;
	}
}
