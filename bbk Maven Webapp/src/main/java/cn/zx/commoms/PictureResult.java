package cn.zx.commoms;
/**
 * 涓婁紶鍥剧墖鐨勮繑鍥炵粨鏋�
 * <p>Title: PictureResult</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	鍏ヤ簯榫�
 * @date	2015骞�8鏈�15鏃ヤ笅鍗�2:53:21
 * @version 1.0
 */
public class PictureResult {

	private int error;
	private String url;
	private String message;
	
	public PictureResult(int error, String url, String message) {
		this.error = error;
		this.url = url;
		this.message = message;
	}
	//鎴愬姛鏃惰皟鐢ㄧ殑鏂规硶
	public static PictureResult ok(String url) {
		return new PictureResult(0, url, null);
	}
	//澶辫触鏃惰皟鐢ㄧ殑鏂规硶
	public static PictureResult error(String message) {
		return new PictureResult(1, null, message);
	}
	public int getError() {
		return error;
	}
	public void setError(int error) {
		this.error = error;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
