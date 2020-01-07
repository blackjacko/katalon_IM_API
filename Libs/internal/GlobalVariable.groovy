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
    public static Object app
     
    /**
     * <p></p>
     */
    public static Object identityCode
     
    /**
     * <p></p>
     */
    public static Object username
     
    /**
     * <p></p>
     */
    public static Object web
     
    /**
     * <p></p>
     */
    public static Object encodedKey
     
    /**
     * <p></p>
     */
    public static Object UserId
     
    /**
     * <p></p>
     */
    public static Object roomId
     
    /**
     * <p></p>
     */
    public static Object console_admin
     
    /**
     * <p></p>
     */
    public static Object refresh_token
     
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
    
            app = selectedVariables['app']
            identityCode = selectedVariables['identityCode']
            username = selectedVariables['username']
            web = selectedVariables['web']
            encodedKey = selectedVariables['encodedKey']
            UserId = selectedVariables['UserId']
            roomId = selectedVariables['roomId']
            console_admin = selectedVariables['console_admin']
            refresh_token = selectedVariables['refresh_token']
            UID = selectedVariables['UID']
            OID = selectedVariables['OID']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
