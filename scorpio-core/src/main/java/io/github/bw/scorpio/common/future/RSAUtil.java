package io.github.bw.scorpio.common.future;

import io.github.bw.scorpio.common.codec.binary.Base64;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;

/**
 * RSA相关工具类
 *
 * @author panpanxu
 */
public class RSAUtil {

  /**
   * 私钥签名 <功能描述>
   *
   * @param src
   * @param priKey
   * @return
   */
  public static byte[] generateSHA1withRSASigature(String src, String priKey) {
    try {
      Signature sigEng = Signature.getInstance("SHA1withRSA");
      byte[] pribyte = Base64.decode(priKey);
      PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(pribyte);
      KeyFactory fac = KeyFactory.getInstance("RSA");
      RSAPrivateKey privateKey = (RSAPrivateKey) fac.generatePrivate(keySpec);
      sigEng.initSign(privateKey);
      sigEng.update(src.getBytes());
      byte[] signature = sigEng.sign();
      return signature;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }


}