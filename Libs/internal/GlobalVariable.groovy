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
    public static Object UID
     
    /**
     * <p></p>
     */
    public static Object OID
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            QAT_APP_Member = selectedVariables['QAT_APP_Member']
            UD_Console_Admin = selectedVariables['UD_Console_Admin']
            UD_WEB_Member = selectedVariables['UD_WEB_Member']
            UD_APP_Member = selectedVariables['UD_APP_Member']
            IdentityCode = selectedVariables['IdentityCode']
            UserName = selectedVariables['UserName']
            EncodedKey = selectedVariables['EncodedKey']
            UserId = selectedVariables['UserId']
            RoomId = selectedVariables['RoomId']
            Refresh_Token = selectedVariables['Refresh_Token']
            UID = selectedVariables['UID']
            OID = selectedVariables['OID']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
