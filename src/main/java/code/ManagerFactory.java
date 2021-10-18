package code;


import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class ManagerFactory {
    private static final Map<String, LoadInfo> loadTimeMap = new HashMap<String, LoadInfo>();
    private static final String CLASS_PATH = "C:\\git\\jvm\\target\\classes\\";
    public static final String MY_MANAGER = "code.MyManager";
    public static BaseManager getManager(String className) {
        File loadFile = new File(CLASS_PATH,className.replaceAll("\\.", "/") + ".class");
        long lastModified = loadFile.lastModified();
        System.out.println("current class loadtime -> "+lastModified);
        if(loadTimeMap.get(className) == null) {
            load(className,lastModified);
        }else if(loadTimeMap.get(className).getLoadTime() != lastModified) {
            load(className,lastModified);
        }

        return loadTimeMap.get(className).getManager();
    }
    private static void load(String className, long lastModified) {
        // TODO Auto-generated method stub
        MyClassLoader myClassLoader = new MyClassLoader(className);
        Class<?> loadClass = null;
        try {
            loadClass = myClassLoader.loadClass(className);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        BaseManager manager = newInstance(loadClass);
        LoadInfo loadInfo = new LoadInfo(myClassLoader, lastModified);
        loadInfo.setManager(manager);
        loadTimeMap.put(className, loadInfo);
    }
    private static BaseManager newInstance(Class<?> loadClass) {
        // TODO Auto-generated method stub
        try {
            System.out.println("load...");
            return (BaseManager)loadClass.getConstructor(new Class[] {}).newInstance(new Object[] {});
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

}