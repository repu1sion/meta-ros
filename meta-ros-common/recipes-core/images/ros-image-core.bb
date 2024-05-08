require ${COREBASE}/meta/recipes-core/images/core-image-minimal.bb

SUMMARY = "A small image just capable of starting core ROS."
DESCRIPTION = "${SUMMARY}"

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_DISTRO_TYPE}_image

IMAGE_FEATURES += "splash ssh-server-openssh"

IMAGE_INSTALL:append = " \
    ros-core \
    bash \
    vim \
    coreutils \
    iw \
    wpa-supplicant \
"
