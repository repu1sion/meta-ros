# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "ROS messages for jsk_pcl_ros and jsk_perception."
AUTHOR = "Ryohei Ueda <ueda@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "https://jsk-docs.readthedocs.io/projects/jsk_recognition/en/latest/jsk_recognition_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jsk_recognition"
ROS_BPN = "jsk_recognition_msgs"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    jsk-footstep-msgs \
    message-generation \
    pcl-msgs \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    jsk-footstep-msgs \
    message-generation \
    pcl-msgs \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    jsk-footstep-msgs \
    message-generation \
    pcl-msgs \
    sensor-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_recognition-release/archive/release/noetic/jsk_recognition_msgs/1.2.15-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/jsk_recognition_msgs"
SRC_URI = "git://github.com/tork-a/jsk_recognition-release;${ROS_BRANCH};protocol=https"
SRCREV = "27d0ac88115cf152384d492b54d44669ca320520"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}