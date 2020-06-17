package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object APP_Member
     
    /**
     * <p></p>
     */
    public static Object WS
     
    /**
     * <p></p>
     */
    public static Object IdentityCode
     
    /**
     * <p></p>
     */
    public static Object UserName
     
    /**
     * <p></p>
     */
    public static Object UserId
     
    /**
     * <p></p>
     */
    public static Object EncodedKey
     
    /**
     * <p></p>
     */
    public static Object EncodedAuth
     
    /**
     * <p></p>
     */
    public static Object RoomId
     
    /**
     * <p></p>
     */
    public static Object Refresh_Token
     
    /**
     * <p></p>
     */
    public static Object Access_Token
     
    /**
     * <p></p>
     */
    public static Object WS_Token
     
    /**
     * <p></p>
     */
    public static Object UID
     
    /**
     * <p></p>
     */
    public static Object OID
     
    /**
     * <p></p>
     */
    public static Object WS_Reply
     
    /**
     * <p></p>
     */
    public static Object EncMsg
     
    /**
     * <p></p>
     */
    public static Object DecMsg
     
    /**
     * <p></p>
     */
    public static Object Account
     
    /**
     * <p></p>
     */
    public static Object Password
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            APP_Member = selectedVariables['APP_Member']
            WS = selectedVariables['WS']
            IdentityCode = selectedVariables['IdentityCode']
            UserName = selectedVariables['UserName']
            UserId = selectedVariables['UserId']
            EncodedKey = selectedVariables['EncodedKey']
            EncodedAuth = selectedVariables['EncodedAuth']
            RoomId = selectedVariables['RoomId']
            Refresh_Token = selectedVariables['Refresh_Token']
            Access_Token = selectedVariables['Access_Token']
            WS_Token = selectedVariables['WS_Token']
            UID = selectedVariables['UID']
            OID = selectedVariables['OID']
            WS_Reply = selectedVariables['WS_Reply']
            EncMsg = selectedVariables['EncMsg']
            DecMsg = selectedVariables['DecMsg']
            Account = selectedVariables['Account']
            Password = selectedVariables['Password']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
