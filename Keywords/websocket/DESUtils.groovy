package websocket

import groovy.transform.CompileStatic

import internal.GlobalVariable

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.util.logging.Logger

/**
 * 3DES加密解密
 * key长度为24个字符，不足可补零
 * IV向量必须为8位<br/>
 * 使用Base64.encodeToString(byte[], Base64.NO_WRAP);来将加密后的byte[]转为String<br/>
 * 使用Base64.decode(String, Base64.NO_WRAP);将转为String的加密字符转换为byte[]<br/>
 * new String(byte[])将解密后的byte[]转为String<br/>
 */
public class DESUtil {
	private static final String TAG = "DES3Util";
	private static final String DES3 = "DESede";

	///////////////////////////////////////////////////////////////////////////
	// DES3
	///////////////////////////////////////////////////////////////////////////

	/**
	 * 3DES CBC模式加密
	 */
	public static byte[] des3EncodeCBC(byte[] key, byte[] iv, byte[] data) {
		try {
			SecretKey DESKey = new SecretKeySpec(key, DES3);    //生成密钥
			Cipher cipher = Cipher.getInstance(DES3 + "/CBC/PKCS5Padding");
			IvParameterSpec ips = new IvParameterSpec(iv);
			cipher.init(Cipher.ENCRYPT_MODE, DESKey, ips);
			byte[] encBytes = cipher.doFinal(data)
			String encString = Base64.encoder.encodeToString(encBytes);
			return GlobalVariable.EncMsg = encString
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	/**
	 * 3DES CBC decrypt
	 */
	public static byte[] des3DecodeCBC(byte[] key, byte[] iv, byte[] data) {
		try {
			SecretKey DESKey = new SecretKeySpec(key, DES3);    //生成密钥
			Cipher cipher = Cipher.getInstance(DES3 + "/CBC/PKCS5Padding");
			IvParameterSpec ips = new IvParameterSpec(iv);
			cipher.init(Cipher.DECRYPT_MODE, DESKey, ips);
			byte[] decBytes = cipher.doFinal(Base64.decoder.decode(data));
			String decmsg = new String(decBytes, "UTF-8");
			return GlobalVariable.DecMsg = decmsg
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}