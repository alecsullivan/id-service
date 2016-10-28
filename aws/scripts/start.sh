#!/bin/bash

echo "Attempting to start id-service..."

INSTANCE=`ec2-metadata | grep instance-id | cut -d ' '  -f2`
REGION=`ec2-metadata | grep placement | cut -d ' '  -f2 | sed 's/.$//'`
ENV=`ec2-describe-tags --region $REGION --filter "resource-type=instance" --filter "resource-id=$INSTANCE" --filter "key=Environment" | cut -d$'\t' -f5`

echo "Located the Environment tag: $ENV"

export SPRING_PROFILES_ACTIVE=$ENV

echo "Set SPRING_PROFILES_ACTIVE to $ENV"

echo "Starting id-service."

service id-service start