#!/bin/bash
if [ -L /etc/init.d/id-service ]
then
  service id-service stop
fi