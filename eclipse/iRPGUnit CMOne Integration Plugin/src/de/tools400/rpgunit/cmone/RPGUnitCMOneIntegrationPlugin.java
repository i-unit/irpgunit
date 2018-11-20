package de.tools400.rpgunit.cmone;

import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class RPGUnitCMOneIntegrationPlugin extends AbstractUIPlugin {

    public static final String IMAGE_RUN_RPGUNIT = "run16.gif"; //$NON-NLS-1$

    public static final String ICONS_PATH = "icons/";

    // The plug-in ID
    public static final String PLUGIN_ID = "de.tools400.rpgunit.cmone"; //$NON-NLS-1$

    // The shared instance
    private static RPGUnitCMOneIntegrationPlugin plugin;

    // URL, where the plug-in is installed
    private static URL installURL;

    /**
     * The constructor
     */
    public RPGUnitCMOneIntegrationPlugin() {
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
     * BundleContext)
     */
    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
        installURL = context.getBundle().getEntry("/");
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.
     * BundleContext)
     */
    @Override
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static RPGUnitCMOneIntegrationPlugin getDefault() {
        return plugin;
    }

    /**
     * Returns an image descriptor for the image file at the given plug-in
     * relative path
     * 
     * @param fileName the image path
     * @return the image descriptor
     */
    public static ImageDescriptor getImageDescriptor(String fileName) {
        return imageDescriptorFromPlugin(PLUGIN_ID, ICONS_PATH + fileName);
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#initializeImageRegistry(org.
     * eclipse .jface.resource.ImageRegistry)
     */
    @Override
    protected void initializeImageRegistry(ImageRegistry reg) {
        super.initializeImageRegistry(reg);

        // add images
        reg.put(IMAGE_RUN_RPGUNIT, getImageDescriptor(IMAGE_RUN_RPGUNIT));
    }

}
