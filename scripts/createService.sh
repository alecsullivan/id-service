[ -f /etc/init.d/id-service ] && echo "id-service already exists as an init.d service." || ln -s /opt/id-service/*.jar /etc/init.d/id-service