package com.xf.SSH;

import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.Session;
import ch.ethz.ssh2.StreamGobbler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * @Auther: XU
 * @Date: 2018/11/8 10:39
 * @Description:
 */
public class SSHTest1 {
    private final static Properties prop =  new Properties();

    static{
        try {

            System.out.println("111111111111111111-------------------------");
            prop.load(SSHTest1.class.getResourceAsStream("/linux.properties"));
            System.out.println("-------------------------");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args){
    String hostname = prop.getProperty("hostname");
    String username = prop.getProperty("username");
    String password =prop.getProperty("password");

    try
    {
        /* Create a connection instance */

        Connection conn = new Connection(hostname);

        /* Now connect */

        conn.connect();

        /* Authenticate.
         * If you get an IOException saying something like
         * "Authentication method password not supported by the server at this stage."
         * then please check the FAQ.
         */

        boolean isAuthenticated = conn.authenticateWithPassword(username, password);

        if (isAuthenticated == false)
            throw new IOException("Authentication failed.");

        /* Create a session */

        Session sess = conn.openSession();

        sess.execCommand("uname -a && date && uptime && who");

        System.out.println("Here is some information about the remote host:");

        /*
         * This basic example does not handle stderr, which is sometimes dangerous
         * (please read the FAQ).
         */

        InputStream stdout = new StreamGobbler(sess.getStdout());

        BufferedReader br = new BufferedReader(new InputStreamReader(stdout));

        while (true)
        {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            System.out.println(line);
        }

        /* Show exit status, if available (otherwise "null") */

        System.out.println("ExitCode: " + sess.getExitStatus());
        /* Close this session */
        sess.close();
        /* Close the connection */
        conn.close();
    }
    catch (IOException e)
    {
        e.printStackTrace(System.err);
        System.exit(2);
    }
}
}
