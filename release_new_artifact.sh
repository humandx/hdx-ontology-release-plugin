pwd=`pwd`
UNPACK_PROJECT_REL_PATH="hdx-ontology-unpack-artifact"
UNPACK_PROJECT_ABS_PATH=$pwd"/"$UNPACK_PROJECT_REL_PATH
DATASTORE_REL_PATH="target/isaac.data"
DATASTORE_ABS_PATH=$UNPACK_PROJECT_ABS_PATH"/"$DATASTORE_REL_PATH
CHANGESETS_DIR_REL_PATH="changesets"
CHANGESETS_DIR_ABS_PATH=$DATASTORE_ABS_PATH"/"$CHANGESETS_DIR_REL_PATH
CHANGESETS_REPO_URL="https://$GIT_TOKEN@github.com/humandx/hdx-ontology-isaac-changesets.git" # Note that GIT_TOKEN must be defined in the environment
RELEASE_TAG=1.1.0
# Unpack artifact
cd hdx-ontology-unpack-artifact
mvn clean install "-Doutputdir=$DATASTORE_REL_PATH"

# clone changeset git repo
git clone --branch $RELEASE_TAG $CHANGESETS_REPO_URL $CHANGESETS_DIR_ABS_PATH"/remote_chnagesets"

#echo $CHANGESETS_DIR_ABS_PATH
