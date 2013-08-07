package com.coodroid.comicsguess.view.base;

import android.app.Activity;
import android.content.Context;

import com.alkaid.base.view.base.BApp;

/**
 * @author Alkaid
 *
 */

public class BaseApp extends BApp{
	/** 第一个Fragment视图的数据模式*/
//	public DataFlag firstViewDataFlag=DataFlag.ALL;
//	public ComAirWrapper comairWrapper = null;
	/**
	 * 获得全局单例  若没有初始化过BaseApp则默认会初始化
	 * @param context
	 * @return
	 */
	public static BaseApp getBaseApp(Context context){
		return getBaseApp(context,true);
	}
	/**
	 * 获得全局单例  根据needInitApp判断在没有初始化过BaseApp的情况下是否要初始化
	 * @param context
	 * @param needInitApp 是否需要初始化BaseApp
	 * @return
	 */
	public static BaseApp getBaseApp(Context context,boolean needInitApp){
		//先设置监听
		if(mAppLifeListener==null)
			setAppLifeListener(appLifeListener);
		return (BaseApp)getBApp(context,needInitApp);
	}
	/** BaseApp生命周期监听 */
	private static AppLifeListener appLifeListener=new AppLifeListener() {
		@Override
		public void onInitApp(BApp baseApp, Activity context) {
			//TODO ComAir相关设置
			/*((BaseApp)baseApp).comairWrapper = new ComAirWrapper();
			ComAirWrapper comairWrapper=((BaseApp)baseApp).comairWrapper;
			eAudioEncodeMode mode=eAudioEncodeMode.eEncodeMode_1Sec;
			Integer iWaveForm=2;
//			Integer iThreshold=125;
			Integer i32Freq, i32iDf;
			i32Freq = comairWrapper.GetComAirProperty(eComAirPropertyTarget.eComAirPropertyTarget_Encode.ordinal(),
					eComAirProperty.eComAirProperty_CentralFreq.ordinal());
			i32iDf = comairWrapper.GetComAirProperty(eComAirPropertyTarget.eComAirPropertyTarget_Encode.ordinal(),
					eComAirProperty.eComAirProperty_iDfValue.ordinal());
			String reg="ZewEhexk";
			comairWrapper.SetComAirEncodeMode(mode.getVal());
			comairWrapper.SetComAirProperty(eComAirPropertyTarget.eComAirPropertyTarget_Encode.ordinal(),
					eComAirProperty.eComAirProperty_WaveFormType.ordinal(),
					iWaveForm);
//			comairWrapper.SetComAirProperty(eComAirPropertyTarget.eComAirPropertyTarget_Decode.ordinal(),
//					eComAirProperty.eComAirProperty_Threshold.ordinal(),
//					iThreshold);
			comairWrapper.SetComAirProperty(eComAirPropertyTarget.eComAirPropertyTarget_Encode.ordinal(),
					eComAirProperty.eComAirProperty_CentralFreq.ordinal(),
					i32Freq);
			comairWrapper.SetComAirProperty(eComAirPropertyTarget.eComAirPropertyTarget_Encode.ordinal(),
					eComAirProperty.eComAirProperty_iDfValue.ordinal(),
					i32iDf);
			int iResult1 = comairWrapper.SetComAirProperty(eComAirPropertyTarget.eComAirPropertyTarget_Both.ordinal(),
					eComAirProperty.eComAirProperty_RegCode.ordinal(),
					reg);
			if ( eComAirErrCode.COMAIR_NOERR.ordinal()==iResult1 ){
//				return true;
			}*/
		}
		@Override
		public void onTerminate(BApp baseApp) {
		}
	};

	
}
