# <u>**HBM Nuclear Tech Mod - 1.12.2 Extended Edition**</u>

This is my 1.12.2 custom version of the mod

which is forked from the fork made by [TheOriginalGolem](https://github.com/TheOriginalGolem/Hbm-s-Nuclear-Tech-GIT)
which is forked from the port made by [Drillgon200](https://github.com/Drillgon200/Hbm-s-Nuclear-Tech-GIT)
which is ported from the original mod made by [HBMTheBobcat](https://github.com/HbmMods/Hbm-s-Nuclear-Tech-GIT).


The latest version can be found on [CurseForge](https://www.curseforge.com/minecraft/mc-mods/hbms-nuclear-tech-mod-extended-edition) or [Modrinth](https://modrinth.com/mod/ntm-extended) or under the [Releases page](https://github.com/Alcatergit/Hbm-s-Nuclear-Tech-GIT/releases).

If you have question or suggestions you can post them on our [NTM Extended Discord](https://discord.gg/Auq95eCEtD)

### **Want to contribute?**

If you want to contribute make a pull request and I'll review it as soon as possible.
Every contribution is very much appreciated by me and the players.

### **Build Guide:**

Download the repository, then open a shell prompt in that folder, then type the following:

`.\gradlew build`

Press enter.

Now just wait for the build to finish and the new Jar file will be in `Hbm-s-Nuclear-Tech-GIT\build\libs`.

This does not work for us. To get the project to build, we need to do the following:

1. Install Maven - "~\Downloads\apache-maven-3.9.9-bin.zip"
2. Download Galacticraft Mod and install to local maven repository
    mvn install:install-file -Dfile="~\Downloads\Galacticraft-1.12.2-4.0.2.283.jar"  -DgroupId=dev.galacticraft -DartifactId=galacticraft-legacy -Dversion=4.0.2.283_mapped_snapshot_20171003-1.12 -Dpackaging=jar
3. Download and install Baubles to local maven repository
    mvn install:install-file -Dfile="~\Downloads\Baubles-1.12-1.5.2.jar" -DgroupId=com.azanor -DartifactId=Baubles -Dversion=1.12-1.5.2_mapped_snapshot_20171003-1.12 -Dpackaging=jar
4. Download and install Jei to local maven repository
    mvn install:install-file -Dfile="~\Downloads\jei_1.12.2-4.16.1.302.jar" -DgroupId=mezz.jei -DartifactId=jei_1.12.2 -Dclassifier=api -Dversion=4.16.1.302_mapped_snapshot_20171003-1.12 -Dpackaging=jar
5. Download and install RedstoneFlux to local maven repository
    mvn install:install-file -Dfile="~\Downloads\RedstoneFlux-1.12-2.1.0.6-universal.jar" -DgroupId=cofh -DartifactId=RedstoneFlux -Dclassifier=universal -Dversion=1.12-2.1.0.6_mapped_snapshot_20171003-1.12 -Dpackaging=jar





#### Discords:

Alcater#2644
Golem#9568
Drillgon200#0288
The Bobcat#8817
