/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.humandx.hdx.ontology.database.builder;

import java.io.File;
import javafx.application.Platform;
import sh.isaac.api.Get;
import sh.isaac.api.LookupService;

/**
 *
 * @author HumanDx
 */
public class BuildDatabase {
    
    public static void main(String[] args){
        String datastorePath = args[0];
        System.out.println(datastorePath);
        File datastore = new File(datastorePath);
        Get.configurationService().setDataStoreFolderPath(datastore.toPath());
        LookupService.startupIsaac();
        LookupService.shutdownSystem();
        Platform.exit();
    }

}
