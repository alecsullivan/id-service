if [ -f /etc/init.d/id-service ];
then
    ln -s /opt/id-service/*.jar /etc/init.d/id-service
fi