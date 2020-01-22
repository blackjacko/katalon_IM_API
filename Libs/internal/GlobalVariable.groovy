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
    public static Object QAT_APP_Member
     
    /**
     * <p></p>
     */
    public static Object QAT_WS
     
    /**
     * <p></p>
     */
    public static Object UD_Console_Admin
     
    /**
     * <p></p>
     */
    public static Object UD_WEB_Member
     
    /**
     * <p></p>
     */
    public static Object UD_APP_Member
     
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
    public static Object EncodedKey
     
    /**
     * <p></p>
     */
    public static Object EncodedAuth
     
    /**
     * <p></p>
     */
    public static Object UserId
     
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
    public static Object DecMsg
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            QAT_APP_Member = selectedVariables['QAT_APP_Member']
            QAT_WS = selectedVariables['QAT_WS']
            UD_Console_Admin = selectedVariables['UD_Console_Admin']
            UD_WEB_Member = selectedVariables['UD_WEB_Member']
            UD_APP_Member = selectedVariables['UD_APP_Member']
            IdentityCode = selectedVariables['IdentityCode']
            UserName = selectedVariables['UserName']
            EncodedKey = selectedVariables['EncodedKey']
            EncodedAuth = selectedVariables['EncodedAuth']
            UserId = selectedVariables['UserId']
            RoomId = selectedVariables['RoomId']
            Refresh_Token = selectedVariables['Refresh_Token']
            Access_Token = selectedVariables['Access_Token']
            WS_Token = selectedVariables['WS_Token']
            UID = selectedVariables['UID']
            OID = selectedVariables['OID']
            WS_Reply = selectedVariables['WS_Reply']
            DecMsg = selectedVariables['DecMsg']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
