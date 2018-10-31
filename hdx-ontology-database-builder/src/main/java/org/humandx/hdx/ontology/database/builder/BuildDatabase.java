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
import sh.isaac.api.constants.SystemPropertyConstants;

/**
 *
 * @author HumanDx
 */
public class BuildDatabase {
    
    public static void main(String[] args){
        String datastorePath = "/Users/adi/HumanDx/ontolgy/ontology-release-plugin/hdx-ontology-database-builder/hdx-ontology-unpack-artifact/target/isaac.data";
        System.setProperty(SystemPropertyConstants.DATA_STORE_ROOT_LOCATION_PROPERTY, datastorePath);
        System.out.println(datastorePath);
        //Get.configurationService().setDataStoreFolderPath(datastore.toPath());
        LookupService.startupIsaac();
        LookupService.shutdownSystem();
        Platform.exit();
    }

}
