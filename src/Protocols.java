/**
 * This interface will be used for the protocols to be used by clients and server.
 * It will have codes for different moves.
 * @author harman Randhawa
 *
 */
public interface Protocols {
	final int PORT = 6789;
	final int MATCH = 1000;
	final int NON_MATCH = 1001;
	final int QUIT = 1002;
	final int STARTGAME = 2003;
	final int REMOVELISTENERS = 1004;
	final int ADDLISTENERS = 1005;
	final int FORFEITGAME = 1006;
	final int FILENAME = 1007;
	final int INSTRUCTIONS = 1008;
	final int GAMEOVER = 1009;
	final int CLIENTID = 1010;
	final static String DEFAULT_FILE_NAME = "Default.jpg";
}
