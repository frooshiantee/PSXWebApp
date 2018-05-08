# README #

This is some simple setup to build the SOAP bindings for the PSX API and push them out to nexus, for consumption by TGA.

### Upgrading the PSX API ###

* Add the new WSDL file to the repository under /src/main/resources
* Edit the pom.xml file, and change the WsdlFiles element to point to contain the new file's name
* To build and install to your local m2 repo, use the install goal
* To push the artifact out to nexus, use the deploy goal
* Once the new version is in nexus, update the pom file in the SBCProvisioning project and replace all sonus classes with their new version

### Future plans ###

In the future, this repository should be merged with the SBCProvisioning project in the iris repository such that generated sources are encapsulated there.
For now, a separate repository provides an easy way to upgrade the PSX API as needed.

### Contact info ###

Any of the usual TGA folks can help with this process.  Tyler Bowen is probably a good place to start.