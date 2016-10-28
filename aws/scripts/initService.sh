#!/bin/bash
echo "Attempting to initialize id-service..."
if [ ! -L /etc/init.d/id-service ]
then
  echo "Creating id-service."
  ln -s /var/id-service/*.jar /etc/init.d/id-service
else
  echo "id-service already exists."
fi