# hdx-ontology-release-plugin
A java program to release new versions of an ISAAC based ontology from a previous artifact and Changesets from a Git repo


Project consists of three sub projects
1. hdx-ontology-unpack-artifact - Downloads the database artifact and unzips it into its target directory
2. hdx-ontology-database-builder - Writes changesets to the database
3. hdx-ontology-release-database-artifact - Packages and releases the new databse as an artifact (NOT IMPLEMENTED YET)

Apart from these there is an orchestration script that makes sure these projects are executed in order. 

Without the shell script, please execute the first project as follows:

`mvn install mvn clean install "-Doutputdir=target/isaac.data"`

Then import changesets into the changeset directory in the isaac.data directory. (or don't)

cd into the 2nd subproject. Change the datasore path in the main class to the target/isaac.data directory of the first subproject.

Run the java program
