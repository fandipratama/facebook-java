import facebook4j.Comment;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.PagableList;
import facebook4j.Post;
import facebook4j.Reading;
import facebook4j.ResponseList;
import facebook4j.auth.AccessToken;

public class PostFromPageExtractor {

/**
 * A simple Facebook4J client which
 * illustrates how to access group feeds / posts / comments.
 * 
 * @param args
 * @throws FacebookException 
 */
public static void main(String[] args) throws FacebookException {

    // Generate facebook instance.
    Facebook facebook = new FacebookFactory().getInstance();
    // Use default values for oauth app id.
    facebook.setOAuthAppId("304775909971413", "313aa74524b7fea29ba1096f77784c93");
    // Get an access token from: 
    // https://developers.facebook.com/tools/explorer
    // Copy and paste it below.
    String accessTokenString = "EAAEVMSvZAldUBACsOY6eZAQCZBpGwQfJnFwwIZBc5u2XuDyI7lJewpXaYOoAJwg8bDEyhozpBwI73RXpEsOO09vEZB7KwsYC0wUkccYN4N6qhlYU3fAio1qPUNPbWQwUPIKXtOu9TvRBQ2aCGvC1erq7qbbvDVuoyPKx1aTMqfGb71pKKgC5jtG2VW37KwiYZD";
    AccessToken at = new AccessToken(accessTokenString);
    // Set access token.
    facebook.setOAuthAccessToken(at);

    // We're done.
    // Access group feeds.
    // You can get the group ID from:
    // https://developers.facebook.com/tools/explorer

    // Set limit to 25 feeds.
    facebook.postStatusMessage("Hello World from Facebook4J.");
    }
}