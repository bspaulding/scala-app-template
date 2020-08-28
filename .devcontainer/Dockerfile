FROM mcr.microsoft.com/vscode/devcontainers/java:11

ARG JDK8_VERSION=""
ARG SBT_VERSION=""

RUN su vscode -c "source /usr/local/sdkman/bin/sdkman-init.sh && \
				if [ "${JDK8_VERSION}" = "" ]; then \
				 sdk install java \$(sdk ls java | grep -m 1 -o ' 8.*.hs-adpt ' | awk '{print \$NF}'); \
				 else sdk install java '${JDK8_VERSION}'; \
				fi"

RUN su vscode -c "source /usr/local/sdkman/bin/sdkman-init.sh && \
				if [ "${SBT_VERSION}" = "" ]; then \
        sdk install sbt; \
        else sdk install sbt '${SBT_VERSION}'; fi"

